package com.labestiagpt.mwater.util;

/**
 * A utility class for performing 3D vector math, typically used for physics calculations.
 */
public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    /**
     * Adds two vectors and returns the resulting vector.
     */
    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    /**
     * Subtracts another vector from this vector and returns the resulting vector.
     */
    public Vector3D subtract(Vector3D other) {
        return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    /**
     * Calculates the dot product of this vector and another vector.
     */
    public double dot(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    /**
     * Calculates the cross product of this vector and another vector.
     */
    public Vector3D cross(Vector3D other) {
        return new Vector3D(
            this.y * other.z - this.z * other.y,
            this.z * other.x - this.x * other.z,
            this.x * other.y - this.y * other.x
        );
    }

    /**
     * Calculates the magnitude of the vector.
     */
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Normalizes the vector (makes it a unit vector).
     */
    public Vector3D normalize() {
        double mag = magnitude();
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    @Override
    public String toString() {
        return String.format("Vector3D(%.2f, %.2f, %.2f)", x, y, z);
    }
}