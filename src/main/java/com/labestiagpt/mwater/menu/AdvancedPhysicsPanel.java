package com.labestiagpt.mwater.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedPhysicsPanel extends JPanel {

    private JSlider gravitySlider;
    private JSlider frictionSlider;
    private JButton applyButton;

    public AdvancedPhysicsPanel() {
        setLayout(new GridLayout(3, 2));

        // Gravity Control
        add(new JLabel("Gravity:"));
        gravitySlider = new JSlider(0, 20, 10);
        gravitySlider.setMajorTickSpacing(5);
        gravitySlider.setPaintTicks(true);
        gravitySlider.setPaintLabels(true);
        add(gravitySlider);

        // Friction Control
        add(new JLabel("Friction:"));
        frictionSlider = new JSlider(0, 100, 50);
        frictionSlider.setMajorTickSpacing(25);
        frictionSlider.setPaintTicks(true);
        frictionSlider.setPaintLabels(true);
        add(frictionSlider);

        // Apply Button
        applyButton = new JButton("Apply Settings");
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applySettings();
            }
        });
        add(applyButton);
    }

    private void applySettings() {
        int gravity = gravitySlider.getValue();
        int friction = frictionSlider.getValue();
        // Process the gravity and friction values here
        System.out.println("Gravity set to: " + gravity);
        System.out.println("Friction set to: " + friction);
    }
}