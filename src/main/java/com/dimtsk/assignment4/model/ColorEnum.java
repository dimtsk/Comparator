package com.dimtsk.assignment4.model;

import java.util.Random;

public enum ColorEnum {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;
    
    public static ColorEnum randomColorGenerator(){
        
        int colorArrayIndicator=
                new Random().nextInt(ColorEnum.values().length);
        
        return ColorEnum.values()[colorArrayIndicator];
    }

    @Override
    public String toString() {
        return ColorEnum.values().toString();
    }
    
    
}
