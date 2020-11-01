package com.vianneydiris.kinomap_android.service;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * The type Retrofit client.
 */
public class RetrofitClient {
    private static Retrofit retrofit;

    //Define the base URL//
    private static final String BASE_URL = "http://api.kinomap.com/";

    /**
     * Gets retrofit instance.
     *
     * @return the retrofit instance
     */
    //Create the Retrofit instance//
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
        return new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return retrofit;
    }
}
