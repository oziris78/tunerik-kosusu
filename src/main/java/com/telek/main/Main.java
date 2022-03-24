package com.telek.main;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // Every class in com.telek.consts package will initialize itself with static blocks while the app starts

        // run the app
        SwingUtilities.invokeLater( () ->  new Application() );
    }

}
