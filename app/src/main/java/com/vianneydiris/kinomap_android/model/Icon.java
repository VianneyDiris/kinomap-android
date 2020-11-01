package com.vianneydiris.kinomap_android.model;

import com.google.gson.annotations.SerializedName;

/**
 * The type Icon.
 */
public class Icon {
    @SerializedName("anchor")
    private Anchor anchor;
    @SerializedName("size")
    private Size size;
    @SerializedName("url")
    private Url url;

    /**
     * Instantiates a new Icon.
     */
    public Icon() {
    }

    /**
     * Instantiates a new Icon.
     *
     * @param anchor the anchor
     * @param size   the size
     * @param url    the url
     */
    public Icon(Anchor anchor, Size size, Url url) {
        this.anchor = anchor;
        this.size = size;
        this.url = url;
    }

    /**
     * Gets anchor.
     *
     * @return the anchor
     */
    public Anchor getAnchor() {
        return anchor;
    }

    /**
     * Sets anchor.
     *
     * @param anchor the anchor
     */
    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public Url getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(Url url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Icon{" +
                "anchor=" + anchor +
                ", size=" + size +
                ", url=" + url +
                '}';
    }
}
