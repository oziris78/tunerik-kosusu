package com.telek.gui;

import com.telek.betterswing.audio.TClipUtils;
import com.telek.consts.Colors;
import com.telek.consts.Fonts;
import com.telek.consts.Sounds;
import com.telek.consts.Strings;
import com.telek.main.Application;
import com.telek.betterswing.components.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sliders {


    private static JSlider tkSlider(Rectangle rect, String borderTitle, ChangeListener listener){
        return new SwingSlider()
                .setOpaque(true)
                .setMinimum(0)
                .setMaximum(100)
                .setValue(50)
                .setBackground(Colors.gray)
                .setForeground(Colors.white)
                .setPaintTrack(true)
                .setPaintLabels(true)
                .setEnabled(true)
                .setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),
                        borderTitle, SwingConstants.CENTER, SwingConstants.TOP, Fonts.cusFont.deriveFont(30f), Colors.white))
                .setBounds(rect)
                .addChangeListener(listener)
                .setPaintTicks(true)
                .setFont(Fonts.cusFont)
                .setOrientation(SwingConstants.HORIZONTAL)
                .setVisible(true)
                .setSnapToTicks(true)
                .setLayout(null)
                .setMajorTickSpacing(50)
                .setMinorTickSpacing(10)
                .getSlider();
    }


    public static JSlider musicGame(){
        return tkSlider(new Rectangle(440,210,400,150), Strings.music, e -> {
            int val = ((JSlider) e.getSource()).getValue();
            TClipUtils.setVolumeToClips(Sounds.musicArray, (double) val / 100d);
            Application.sliderMusic.setValue(val);
        });
    }

    public static JSlider music(){
        return tkSlider(new Rectangle(440,210,400,150), Strings.music, e -> {
            int val = ((JSlider) e.getSource()).getValue();
            TClipUtils.setVolumeToClips(Sounds.musicArray, (double) val / 100d);
            Application.sliderMusicGame.setValue(val);
        });
    }


    public static JSlider sfxGame(){
        return tkSlider(new Rectangle(440,50,400,150), Strings.sfx, e -> {
            int val = ((JSlider) e.getSource()).getValue();
            TClipUtils.setVolumeToClips(Sounds.sfxArray, (double) val / 100);
            Application.sliderSFX.setValue( ((JSlider) e.getSource()).getValue() );
        });
    }

    public static JSlider sfx(){
        return tkSlider(new Rectangle(440,50,400,150), Strings.sfx, e -> {
            int val = ((JSlider) e.getSource()).getValue();
            TClipUtils.setVolumeToClips(Sounds.sfxArray, (double) val / 100);
            Application.sliderSFXGame.setValue( ((JSlider) e.getSource()).getValue() );
        });
    }



}
