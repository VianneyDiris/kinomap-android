package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Vehicle.
 */
public class Vehicle {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("training")
    @Expose
    private Object training;
    @SerializedName("icon")
    @Expose
    private Icon icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTraining() {
        return training;
    }

    public void setTraining(Object training) {
        this.training = training;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", training=" + training +
                ", icon=" + icon +
                '}';
    }
}