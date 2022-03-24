package com.telek.entities.normal;

import com.telek.consts.Images;
import com.telek.consts.Strings;
import com.telek.entities.AbstractMonster;

public class Mummy extends AbstractMonster {
    public Mummy(){ super(32, 22, 0.95f, 0.5f, 0, 35, Strings.mummy, Images.mummy); }
}