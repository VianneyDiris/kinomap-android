package com.vianneydiris.kinomap_android.model;

/**
 * The type Vehicle.
 */
public class Vehicle {
    private Long id;
    private String name;
    private String training;
    private Icon icon;

    /**
     * Instantiates a new Vehicle.
     */
    public Vehicle() {
    }

    /**
     * Instantiates a new Vehicle.
     *
     * @param id       the id
     * @param name     the name
     * @param training the training
     * @param icon     the icon
     */
    public Vehicle(Long id, String name, String training, Icon icon) {
        this.id = id;
        this.name = name;
        this.training = training;
        this.icon = icon;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets training.
     *
     * @return the training
     */
    public String getTraining() {
        return training;
    }

    /**
     * Sets training.
     *
     * @param training the training
     */
    public void setTraining(String training) {
        this.training = training;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", training='" + training + '\'' +
                ", icon=" + icon +
                '}';
    }
}
