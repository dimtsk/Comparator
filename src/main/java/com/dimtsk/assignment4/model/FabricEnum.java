package com.dimtsk.assignment4.model;

import java.util.Random;

public enum FabricEnum {
    WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK;
    
    //RETURNS AND RANDOM ELEMENT
    public static FabricEnum randomFabricGenerator(){
        
        int fabricArrayIndicator=
                new Random().nextInt(FabricEnum.values().length);
        return FabricEnum.values()[fabricArrayIndicator];
    }

    @Override
    public String toString() {
        return FabricEnum.values().toString();
    }
    
}
