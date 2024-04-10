package org.yates.controller;

import org.yates.view.Window;
import org.yates.view.cards.MenuCard;

public class Menu {
    public Menu() {
        Window window = new Window("Menu - Yates 2024");

        CardHandler.registerCard("Menu", new MenuCard());

        CardHandler.nextCard();
    }
}
