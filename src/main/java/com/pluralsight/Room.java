package com.pluralsight;

public class Room {
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;
    private int numberOfBeds;

    public Room(double price, boolean occupied, boolean dirty, boolean available, int numberOfBeds) {
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
