package com.telek.gui;

import com.telek.consts.Colors;
import com.telek.betterswing.components.*;
import com.telek.main.Application;
import com.telek.utils.TKUtils;

import javax.swing.*;

public class Panels {

    public static JPanel tkPanel(){
        return new SwingPanel()
                .setBounds(TKUtils.screenWideRect())
                .setBackground(Colors.gray)
                .setLayout(null)
                .setEnabled(true)
                .setVisible(true)
                .setOpaque(true)
                .getPanel();
    }

    public static JPanel shopPanel(){
        return new SwingPanel(tkPanel())
                .setBackground(Colors.black)
                .getPanel();
    }


}
