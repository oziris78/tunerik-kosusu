package com.telek.entities.bosses;

import com.telek.consts.Images;
import com.telek.consts.Strings;
import com.telek.entities.AbstractMonster;

public class BlueSlime extends AbstractMonster {
    public BlueSlime(){ super(50,30,0.7f,0.4f, 20,50, Strings.blueSlime, Images.blueSlime); }
}