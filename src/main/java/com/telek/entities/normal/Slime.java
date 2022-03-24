package com.telek.entities.normal;

import com.telek.consts.Images;
import com.telek.consts.Strings;
import com.telek.entities.AbstractMonster;

public class Slime extends AbstractMonster {
    public Slime(){
        super(20, 15, 0.95f, 0.5f, 0, 12, Strings.slime, Images.slime);
    }
}
