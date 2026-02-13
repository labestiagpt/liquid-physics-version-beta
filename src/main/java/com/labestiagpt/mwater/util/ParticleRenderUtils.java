// ParticleRenderUtils.java

package com.labestiagpt.mwater.util;

import com.labestiagpt.mwater.particle.Particle;
import java.util.List;
import java.awt.Graphics;

/**
 * A utility class for particle rendering and visualization.
 */
public class ParticleRenderUtils {
    /**
     * Renders a list of particles on the given graphics context.
     * @param g The graphics context.
     * @param particles The list of particles to render.
     */
    public static void renderParticles(Graphics g, List<Particle> particles) {
        for (Particle particle : particles) {
            g.setColor(particle.getColor());
            g.fillOval((int) particle.getX(), (int) particle.getY(), particle.getSize(), particle.getSize());
        }
    }

    /**
     * Visualizes a single particle's effect in a simplified manner.
     * @param g The graphics context.
     * @param particle The particle to visualize.
     */
    public static void visualizeParticle(Graphics g, Particle particle) {
        g.setColor(particle.getColor());
        g.fillOval((int) particle.getX(), (int) particle.getY(), particle.getSize(), particle.getSize());
        // Additional visualization effects can be added here
    }
}
