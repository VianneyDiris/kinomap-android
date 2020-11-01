package com.vianneydiris.kinomap_android.service;

import com.vianneydiris.kinomap_android.model.Vehicle;

import java.util.List;

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
    @GET()
    Call<List<Vehicle>> getAllVehicles();
}
