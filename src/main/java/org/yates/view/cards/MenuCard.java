package org.yates.view.cards;

import org.yates.view.components.NavigatorItem;

import javax.swing.*;

public class MenuCard extends JPanel {
    public MenuCard() {
        add(new NavigatorItem("Hello", "Wonderful description", null));
        add(new NavigatorItem("Hello", "Wonderful description", null));
        add(new NavigatorItem("Hello", "Wonderful description", null));
        add(new NavigatorItem("Hello", "Wonderful description", null));
        add(new NavigatorItem("Hello", "Wonderful description", null));
    }
}
