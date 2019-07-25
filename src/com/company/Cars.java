package com.company;

public abstract class Cars {

    private int SteeringWheel;
    private boolean Wheel;
    private String CarName;


    public Cars(int steeringWheel, boolean wheel, String carName){
        this.setSteeringWheel(steeringWheel);
        this.setWheel(wheel);
        this.setCarName(carName);
    }

    public int getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(int steeringWheel) {
        SteeringWheel = steeringWheel;
    }

    public boolean isWheel() {
        return Wheel;
    }

    public void setWheel(boolean wheel) {
        Wheel = wheel;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }
}
