package linkedin.Chapter1.Car;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi There!");


        Car myCar = new Car(32.5,
                "BH4455MH",
                Color.BLACK,
                180,
                true);

        Car friendCar = new Car(35.6,
                "BH4556TM",
                Color.BLUE,
                220,
                false);

        System.out.println("My Car's License Number: " + myCar.lincensePlateNumber);
        System.out.println("Friend's Car Average MPG: " + friendCar.averageMilesPerGallon);

        // let's change car's color
        System.out.println("My car's color before changing: " + friendCar.carPaintColor);
        friendCar.changePaintColor(Color.RED);
        System.out.println("My car's color after changing: " + friendCar.carPaintColor);

        // to increase cars speed let's use the method increaseSpeed
        int mySpeedCar = myCar.carMaxSpeed;
        System.out.println("My Car's current speed: " + mySpeedCar);
        mySpeedCar = myCar.increaseSpeed(mySpeedCar);
        System.out.println("My Car's speed after upgrade: " + mySpeedCar);
    }

}
