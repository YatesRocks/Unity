package org.yates.view;

import javax.swing.*;

public class Window extends JFrame {
    public Window(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // init cardhandler

        setVisible(true);
    }
}
