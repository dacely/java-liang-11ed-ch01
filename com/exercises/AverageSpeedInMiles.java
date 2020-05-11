package com.exercises;

public class AverageSpeedInMiles {
    public static void main(String[] args) {
        System.out.println("Distance: 15 Km");
        System.out.println("Time: 50 min");
        System.out.printf("Average Speed: %1$.2f miles/hour", 15 * 1.6 / (50.0 / 60.0));
    }
}
