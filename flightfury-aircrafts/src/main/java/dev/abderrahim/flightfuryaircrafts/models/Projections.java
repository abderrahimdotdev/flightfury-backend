package dev.abderrahim.flightfuryaircrafts.models;


public class Projections{
    public record AircraftStats(int minSpeed, int maxSpeed, double minHeight, double maxHeight, int minWeight,
                                int maxWeight, double minWingspan, double maxWingspan, double minLength,
                                double maxLength) {

    }
}


