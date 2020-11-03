package com.vianneydiris.kinomap_android;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.vianneydiris.kinomap_android.layout.VehicleAdapter;
import com.vianneydiris.kinomap_android.model.MyResponse;
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
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);


        //Create a handler for the RetrofitInstance interface//
        VehicleService service = RetrofitClient.getRetrofitInstance().create(VehicleService.class);
        Call<MyResponse> call = service.getAllVehicles();
        ;

        //Execute the request asynchronously//
        call.enqueue(new Callback<MyResponse>() {

            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                if (response.isSuccessful()) {
                    VehicleList vehicleList = response.body().getResponse();
                    System.out.println(vehicleList.getStatus());
                    List<Vehicle> vehicles = vehicleList.getResponse();
                    VehicleAdapter adapter = new VehicleAdapter(MainActivity.this, vehicles);
                    mListView.setAdapter(adapter);
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.println(vehicles.get(i));
                    }
                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });


    }


}