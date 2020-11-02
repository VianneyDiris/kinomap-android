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
    @SerializedName("unlockedContent")
    @Expose
    private List<Object> unlockedContent = null;

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

    public List<Object> getUnlockedContent() {
        return unlockedContent;
    }

    public void setUnlockedContent(List<Object> unlockedContent) {
        this.unlockedContent = unlockedContent;
    }

}
