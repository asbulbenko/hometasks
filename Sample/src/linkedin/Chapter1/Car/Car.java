package linkedin.Chapter1.Car;

import java.awt.*;

public class Car {

    // We created a class Car as blue print
    // and let's instantiate an car object in Main class.
    // Default values for constructor is 0, NUll, Color, false.

    double averageMilesPerGallon;
    String lincensePlateNumber;
    Color carPaintColor;
    int carMaxSpeed;
    boolean areTailLightsWorking;

    public Car(double inputAverageMilesPerGallon,
               String inputLicensePlateNumber,
               Color inputPaintColor,
               int inputCarMaxSpeed,
               boolean inputTailLightsWorking) {

        this.averageMilesPerGallon = inputAverageMilesPerGallon;
        this.lincensePlateNumber = inputLicensePlateNumber;
        this.carPaintColor = inputPaintColor;
        this.carMaxSpeed = inputCarMaxSpeed;
        this.areTailLightsWorking = inputTailLightsWorking;

    }

    public void changePaintColor(Color newPaintColor) {
        this.carPaintColor = newPaintColor;
    }

    //method to increase speed must return value and cannot be void
    public int increaseSpeed(int currentSpeed) {
        currentSpeed+=100;
        return currentSpeed;
    }

}
