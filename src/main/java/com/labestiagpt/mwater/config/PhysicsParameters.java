package com.labestiagpt.mwater.config;

public class PhysicsParameters {
    // Default physics parameters
    private double gravity = 9.81; // m/s^2
    private double friction = 0.5;
    private double density = 1000; // kg/m^3

    // Getter and Setter for gravity
    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    // Getter and Setter for friction
    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    // Getter and Setter for density
    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}