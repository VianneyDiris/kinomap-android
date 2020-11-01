package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.SerializedName;

/**
 * The type Size.
 */
public class Size {
    @SerializedName("height")
    private int height;
    @SerializedName("width")
    private int width;

    /**
     * Instantiates a new Size.
     */
    public Size() {
    }

    /**
     * Instantiates a new Size.
     *
     * @param height the height
     * @param width  the width
     */
    public Size(int height, int width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Size{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
