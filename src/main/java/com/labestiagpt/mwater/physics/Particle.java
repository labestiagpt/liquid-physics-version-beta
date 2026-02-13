package com.labestiagpt.mwater.physics;

public class Particle {
    private double mass;
    private double[] position; // {x, y, z}
    private double[] velocity; // {vx, vy, vz}

    public Particle(double mass, double[] position, double[] velocity) {
        this.mass = mass;
        this.position = position;
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public void setVelocity(double[] velocity) {
        this.velocity = velocity;
    }

    public void move(double deltaTime) {
        for (int i = 0; i < position.length; i++) {
            position[i] += velocity[i] * deltaTime;
        }
    }
}