package com.twistral.gui;

import com.twistral.consts.Colors;
import com.twistral.betterswing.components.*;
import com.twistral.utils.TKUtils;

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
