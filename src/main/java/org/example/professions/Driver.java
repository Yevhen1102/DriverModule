package org.example.professions;

public class Driver {
    private String carModel;

    public Driver(String carModel) {
        this.carModel = carModel;
    }

    public void displayInfo1() {
        System.out.println("CarModel = " + this.carModel);
        System.out.println("I'm driving!");
    }


}
