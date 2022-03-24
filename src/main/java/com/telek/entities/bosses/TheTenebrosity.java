package com.telek.entities.bosses;

import com.telek.consts.Images;
import com.telek.consts.Strings;
import com.telek.entities.AbstractMonster;
import com.telek.main.Application;

public class TheTenebrosity extends AbstractMonster {

    public TheTenebrosity(){
        super(500, 70, 0.65f, 0.65f, 40, 9999, Strings.theTenebrosity,
                Application.getPlayer().getCharacterImage().equals(Images.tekin) ? Images.theTenebrosityTEKIN : Images.theTenebrosityAYCA);
    }


}
