package org.yates.view;

import org.yates.view.components.NavigatorItem;

import javax.swing.*;
import java.awt.*;
import org.yates.controller.CardHandler;

public class Window extends JFrame {
    public Window(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        initLayout();

        setVisible(true);
    }

    private void initLayout() {
        CardLayout layout;
        setLayout(layout = new CardLayout());
        JPanel cardPanel = new JPanel(layout);
        CardHandler.registerLayout(layout);
        CardHandler.registerRootPanel(cardPanel);
        add(cardPanel);
    }
}
