package com.pluralsight;

public class Vehicle {
    private long vehicle;
    private String  makeModel;
    private String  colors;
    private int odometerReading;
    private  double price;


    //constructor
    public Vehicle(long vehicle, String makeModel, String colors, int odometerReading, double price) {
        this.vehicle = vehicle;
        this.makeModel = makeModel;
        this.colors = colors;
        this.odometerReading = odometerReading;
        this.price = price;
    }


    //getter and setter.
    public long getVehicle() {
        return vehicle;
    }

    public void setVehicle(long vehicle) {
        this.vehicle = vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
}
