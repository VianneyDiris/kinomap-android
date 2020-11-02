package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyResponse {
    @SerializedName("vehicleList")
    @Expose
    private VehicleList response;

    public VehicleList getResponse() {
        return response;
    }

    public void setResponse(VehicleList response) {
        this.response = response;
    }
}
