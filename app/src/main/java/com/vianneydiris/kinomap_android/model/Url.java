package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.SerializedName;

/**
 * The type Url.
 */
public class Url {
    @SerializedName("left")
    private String left;
    @SerializedName("right")
    private String right;
    @SerializedName("size50x50")
    private String size50x50;

    /**
     * Instantiates a new Url.
     */
    public Url() {
    }

    /**
     * Instantiates a new Url.
     *
     * @param left      the left
     * @param right     the right
     * @param size50x50 the size 50 x 50
     */
    public Url(String left, String right, String size50x50) {
        this.left = left;
        this.right = right;
        this.size50x50 = size50x50;
    }

    /**
     * Gets left.
     *
     * @return the left
     */
    public String getLeft() {
        return left;
    }

    /**
     * Sets left.
     *
     * @param left the left
     */
    public void setLeft(String left) {
        this.left = left;
    }

    /**
     * Gets right.
     *
     * @return the right
     */
    public String getRight() {
        return right;
    }

    /**
     * Sets right.
     *
     * @param right the right
     */
    public void setRight(String right) {
        this.right = right;
    }

    /**
     * Gets size 50 x 50.
     *
     * @return the size 50 x 50
     */
    public String getSize50x50() {
        return size50x50;
    }

    /**
     * Sets size 50 x 50.
     *
     * @param size50x50 the size 50 x 50
     */
    public void setSize50x50(String size50x50) {
        this.size50x50 = size50x50;
    }

    @Override
    public String toString() {
        return "Url{" +
                "left='" + left + '\'' +
                ", right='" + right + '\'' +
                ", size50x50='" + size50x50 + '\'' +
                '}';
    }
}
