package com.twistral.utils;

import com.twistral.betterswing.audio.TClipUtils;
import com.twistral.main.Application;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.util.List;


public class TKUtils {

    public static SwingWorker<Void, String> animas_TK(String[] arr, JLabel lb, int waitTimeBetweenWordsMilisec, int waitTimeBeginningMilisec) {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() {
                sleepMilisecs(waitTimeBeginningMilisec);
                for(String s : arr) {
                    publish(s);
                    sleepMilisecs(waitTimeBetweenWordsMilisec);
                }
                return null;
            }
            @Override
            protected void process(List<String> dzl) {
                lb.setText(dzl.get(dzl.size()-1));
            }
        };
        return worker;
    }


    public static SwingWorker<Void, String> cutsceneTK(String[] wordHTML, ImageIcon icon, int waitTimeBetweenWordsMilisec, int waitTimeBeginningMilisec) {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() {
                Application.lbMiddle.setIcon(icon);
                sleepMilisecs(waitTimeBeginningMilisec);
                for(String s : wordHTML) {
                    publish(s);
                    sleepMilisecs(waitTimeBetweenWordsMilisec);
                }
                return null;
            }
            @Override
            protected void process(List<String> dzl) {
                if(!this.isCancelled()){
                    Application.lbDown.setText(dzl.get(dzl.size()-1));
                }
            }
        };
        return worker;
    }

    public static Rectangle screenWideRect(){
        return new Rectangle(0,0, Application.EN, Application.BOY);
    }


    public static int soundPlayingIndex = 0;
    public static void playClipMod(Clip... clips){
        TClipUtils.playClip(clips[soundPlayingIndex % clips.length]);
        soundPlayingIndex++;
    }

    public static void sleepSecs(int seconds){
        sleepMilisecs(seconds * 1000);
    }

    public static void sleepMilisecs(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }



}
