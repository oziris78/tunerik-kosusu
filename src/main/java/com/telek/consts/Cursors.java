package com.telek.consts;


import com.telek.main.Main;
import com.telek.betterswing.res.ResourceUtils;

import java.awt.*;


public class Cursors {
    public static Cursor cursor1;

    static {
        Image imgCursor1 = ResourceUtils.getImage(Main.class.getResource("/res/imlec.png"));
        cursor1 = ResourceUtils.createCursor(imgCursor1, new Point(0,0), "imleccc");
    }
}
