package org.yates.view.components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class NavigatorItem extends JPanel {
    public NavigatorItem(String pageName, String description, ActionListener onClick) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        JButton paginator = new JButton(pageName);
        paginator.setToolTipText("Navigates to " + pageName);
        paginator.addActionListener(onClick);
        add(paginator);
        add(new JLabel(description));
    }
}
