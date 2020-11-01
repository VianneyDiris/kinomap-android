package com.vianneydiris.kinomap_android.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * The type Retrofit client.
 */
public class RetrofitClient {
    private static Retrofit retrofit;

    //Define the base URL//
    private static final String BASE_URL = "http://api.kinomap.com/vehicle/list?icon=1&lang=en-gb&forceStandard=1&outputFormat\n" +
            "=json&appToken=8qohg5a9c6q6x58szpyxizvp91yary3setxdxutl10dugtel1syjs6gmrp33o\n" +
            "o40a356j2cxt6vdcpzg095drsym5blnyen0hi4bdq32j61clfux2i9vtuhr";

    /**
     * Gets retrofit instance.
     *
     * @return the retrofit instance
     */
    //Create the Retrofit instance//
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())  //Add the converter/
                    .build();  //Build the Retrofit instance//
        }
        return retrofit;
    }
}
