// FluidPreviewRenderer.java
// This file is responsible for rendering a real-time fluid preview in the main menu.

package com.labestiagpt.mwater.menu;

import javax.swing.*;
import java.awt.*;

public class FluidPreviewRenderer extends JPanel {
    private final int width;
    private final int height;

    public FluidPreviewRenderer(int width, int height) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Add fluid rendering logic here
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, width, height); // Example of drawing fluid
    }

    public void updateFluidPreview() {
        // Logic to update the fluid preview
        repaint();
    }
}