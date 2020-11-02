package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class VehicleList {
    @SerializedName("vehicleList")
    private List<Vehicle> vehicles;

    public VehicleList() {
        vehicles = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
