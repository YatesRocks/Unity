package org.yates;

import javax.swing.SwingUtilities;
import org.yates.controller.Menu;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Menu::new);
    }
}