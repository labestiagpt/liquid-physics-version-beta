// CollisionHandler.java

package com.labestiagpt.mwater.physics;

public class CollisionHandler {
    // Method to handle collision detection between particles
    public static boolean detectCollision(Particle p1, Particle p2) {
        double distance = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
        return distance < (p1.getRadius() + p2.getRadius());
    }

    // Method to handle collision response between particles
    public static void resolveCollision(Particle p1, Particle p2) {
        // Simple elastic collision response implementation
        double deltaX = p2.getX() - p1.getX();
        double deltaY = p2.getY() - p1.getY();
        double angle = Math.atan2(deltaY, deltaX);

        // Move particles apart based on their radius
        double overlap = p1.getRadius() + p2.getRadius() - Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        p1.setX(p1.getX() - (overlap / 2) * Math.cos(angle));
        p1.setY(p1.getY() - (overlap / 2) * Math.sin(angle));
        p2.setX(p2.getX() + (overlap / 2) * Math.cos(angle));
        p2.setY(p2.getY() + (overlap / 2) * Math.sin(angle));
    }
}