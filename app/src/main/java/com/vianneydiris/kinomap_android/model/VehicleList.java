package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VehicleList {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("response")
    @Expose
    private List<Vehicle> response = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Vehicle> getResponse() {
        return response;
    }

    public void setResponse(List<Vehicle> response) {
        this.response = response;
    }

}
