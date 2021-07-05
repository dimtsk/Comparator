package com.dimtsk.assignment4.model;

import java.util.Random;

public enum SizeEnum {
    XS, S, M, L, XL, XXL, XXXL;
    
    public static SizeEnum randomSizeGenerator(){
        int sizeArrayIndicator=
                new Random().nextInt(SizeEnum.values().length);
        return SizeEnum.values()[sizeArrayIndicator];
    }

    @Override
    public String toString() {
        return SizeEnum.values().toString();
    }
    
    
}
