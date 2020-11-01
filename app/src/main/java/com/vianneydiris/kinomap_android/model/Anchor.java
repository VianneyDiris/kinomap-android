package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.SerializedName;

/**
 * The type Anchor.
 */
public class Anchor {
    @SerializedName("x")
    private int x;
    @SerializedName("y")
    private int y;

    /**
     * Instantiates a new Anchor.
     */
    public Anchor() {
    }

    /**
     * Instantiates a new Anchor.
     *
     * @param x the x
     * @param y the y
     */
    public Anchor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Anchor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
