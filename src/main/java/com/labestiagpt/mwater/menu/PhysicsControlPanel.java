package com.labestiagpt.mwater.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsControlPanel extends JPanel {

    private JSlider gravitySlider;
    private JSlider frictionSlider;
    private JSlider bounceSlider;

    public PhysicsControlPanel() {
        setLayout(new GridLayout(3, 2));

        // Gravity Slider
        JLabel gravityLabel = new JLabel("Gravity:");
        gravitySlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        gravitySlider.setMajorTickSpacing(20);
        gravitySlider.setMinorTickSpacing(5);
        gravitySlider.setPaintTicks(true);
        gravitySlider.setPaintLabels(true);

        // Friction Slider
        JLabel frictionLabel = new JLabel("Friction:");
        frictionSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        frictionSlider.setMajorTickSpacing(20);
        frictionSlider.setMinorTickSpacing(5);
        frictionSlider.setPaintTicks(true);
        frictionSlider.setPaintLabels(true);

        // Bounce Slider
        JLabel bounceLabel = new JLabel("Bounce:");
        bounceSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 70);
        bounceSlider.setMajorTickSpacing(20);
        bounceSlider.setMinorTickSpacing(5);
        bounceSlider.setPaintTicks(true);
        bounceSlider.setPaintLabels(true);

        // Adding components to panel
        add(gravityLabel);
        add(gravitySlider);
        add(frictionLabel);
        add(frictionSlider);
        add(bounceLabel);
        add(bounceSlider);
    }

    public double getGravity() {
        return gravitySlider.getValue();
    }

    public double getFriction() {
        return frictionSlider.getValue();
    }

    public double getBounce() {
        return bounceSlider.getValue();
    }
}
