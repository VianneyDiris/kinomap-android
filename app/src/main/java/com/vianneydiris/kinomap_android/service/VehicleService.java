package com.vianneydiris.kinomap_android.service;

import com.vianneydiris.kinomap_android.model.VehicleList;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * The interface Vehicle service.
 */
public interface VehicleService {

    /**
     * Gets all vehicles.
     *
     * @return the all vehicles
     */
    @GET("vehicle/list?icon=1&lang=en-gb&forceStandard=1&outputFormat\n" +
          "=json&appToken=8qohg5a9c6q6x58szpyxizvp91yary3setxdxutl10dugtel1syjs6gmrp33o\n" +
          "o40a356j2cxt6vdcpzg095drsym5blnyen0hi4bdq32j61clfux2i9vtuhr")
    Call<VehicleList> getAllVehicles();
}
