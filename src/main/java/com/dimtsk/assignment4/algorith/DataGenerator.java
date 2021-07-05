package com.dimtsk.assignment4.algorith;

import com.dimtsk.assignment4.model.ColorEnum;
import com.dimtsk.assignment4.model.FabricEnum;
import com.dimtsk.assignment4.model.SizeEnum;
import com.dimtsk.assignment4.model.TShirt;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public List<TShirt> genarateTShirtData() {
        List<TShirt> tShirt = new ArrayList<TShirt>();
        int numberOfData = 40;

        for (int i = 1; i <= numberOfData; i++) {
            tShirt.add(
                    new TShirt(
                            SizeEnum.randomSizeGenerator().name(),
                            ColorEnum.randomColorGenerator().name(),
                            FabricEnum.randomFabricGenerator().name()
                    ));
        }
        
        return tShirt;
    }
    
    public void printData(List<TShirt> tShirt){
        int count=0;
        for (TShirt tshirt:tShirt){
            count++;
            System.out.println(count+") "+tshirt);
        }
    }
    
    public static void underline(){
        System.out.println("----------------------------------------------------------");
    }

}
