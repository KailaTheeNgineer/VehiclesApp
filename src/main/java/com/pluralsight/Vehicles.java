package com.pluralsight;

import java.util.Scanner;

public class Vehicles {
    public static void main(String[] args) {

        boolean home = true;

        while (home) {


            Moped testRide1 = new Moped();
            testRide1.setColor("Pink");
            testRide1.setFuelCapacity(7);

            System.out.println("This Vehicle's color is: " + testRide1.getColor()
                    + "\nThe fuel capacity is: " + testRide1.getFuelCapacity());
            System.out.println("Enter X to Quit"); Scanner myScanner = new Scanner(System.in);
            String userInput = myScanner.nextLine();

            if (userInput.equalsIgnoreCase("X")) {

                home = false;

            }


        }
    }
}
