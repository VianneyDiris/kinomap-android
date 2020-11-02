package com.vianneydiris.kinomap_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vianneydiris.kinomap_android.model.Vehicle;
import com.vianneydiris.kinomap_android.model.VehicleList;
import com.vianneydiris.kinomap_android.service.RetrofitClient;
import com.vianneydiris.kinomap_android.service.VehicleService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a handler for the RetrofitInstance interface//
        VehicleService service = RetrofitClient.getRetrofitInstance().create(VehicleService.class);
        Call<VehicleList> call = service.getAllVehicles();

        //Execute the request asynchronously//
        call.enqueue(new Callback<VehicleList>() {

            @Override
            public void onResponse(Call<VehicleList> call, Response<VehicleList> response) {
                if(response.isSuccessful()) {
                    VehicleList changesList = response.body();
                    for (int i=0; i<changesList.getVehicles().size(); i++) {
                        System.out.println(changesList.getVehicles().get(i));
                    }
                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<VehicleList> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

}