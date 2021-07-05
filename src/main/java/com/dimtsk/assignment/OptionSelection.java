package com.dimtsk.assignment;

import com.dimtsk.assignment4.algorith.ColorComparatorAsc;
import com.dimtsk.assignment4.algorith.ColorComparatorDesc;
import com.dimtsk.assignment4.algorith.DataGenerator;
import com.dimtsk.assignment4.algorith.FabricComparatorAsc;
import com.dimtsk.assignment4.algorith.FabricComparatorDesc;
import com.dimtsk.assignment4.algorith.SizeComparatorAsc;
import com.dimtsk.assignment4.algorith.SizeComparatorDesc;
import com.dimtsk.assignment4.model.TShirt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptionSelection {

    /*
    MENU
     */
    public void optionMenu() {

        System.out.println("SELECT ONE OF THE FOLLOWING OPTIONS:\n"
                + "1) UNORDER LIST\n"
                + "2) ORDER BY SIZE\n"
                + "3) ORDER BY COLOR\n"
                + "4) ORDER BY FABRIC\n"
                + "5) ORDER BY SIZE-COLOR-FABRIC");

        selector(InputValidators.controInput(1, 5));
    }

    /*
    ASK USER IF HE WANTS TO SEE ANOTHER LIST
     */
    public void continueWithAnotherList() {
        boolean result;
        System.out.println("DO YOU WAND TO SEE ANOTHER LIST? (Y/N)");
        result = InputValidators.yesOrNo();
        if (result == true) {
            optionMenu();
        }
    }

    /*
    SELECTED RESULT
     */
    public void selector(int option) {
        List<TShirt> tShirt = new ArrayList<TShirt>();
        DataGenerator dg = new DataGenerator();
        tShirt = dg.genarateTShirtData();

        switch (option) {
            case 1:
                /*
        GENERATE AND PRINT THE DATA OF AN UNORDER LIST
                 */
                System.out.println("**********UNORDER LIST**********");
//                tShirt = dg.genarateTShirtData();
                dg.printData(tShirt);
                dg.underline();

                continueWithAnotherList();
                break;
            case 2:
                /*
        LIST ORDER VIA SIZE ASC-DESC
                 */
                System.out.println("**********ASCENDING SIZE ORDER**********");
                Collections.sort(tShirt, new SizeComparatorAsc());
                dg.printData(tShirt);
                DataGenerator.underline();

                System.out.println("**********DESCENDING SIZE ORDER**********");
                Collections.sort(tShirt, new SizeComparatorDesc());
                dg.printData(tShirt);
                dg.underline();

                continueWithAnotherList();
                break;

            case 3:
                /*
        LIST ORDER VIA COLOR ASC-DESC
                 */
                System.out.println("**********ASCENDING COLOR ORDER**********");
                Collections.sort(tShirt, new ColorComparatorAsc());
                dg.printData(tShirt);
                dg.underline();

                System.out.println("**********DESCENDING COLOR ORDER**********");
                Collections.sort(tShirt, new ColorComparatorDesc());
                dg.printData(tShirt);
                dg.underline();
                
                continueWithAnotherList();
                break;

            case 4:
                /*
        LIST ORDER VIA FABRIC ASC-DESC
                 */

                System.out.println("**********ASCENDING FABRIC ORDER**********");
                Collections.sort(tShirt, new FabricComparatorAsc());
                dg.printData(tShirt);
                dg.underline();

                System.out.println("**********DESCENDING FABRIC ORDER**********");
                Collections.sort(tShirt, new FabricComparatorDesc());
                dg.printData(tShirt);
                dg.underline();

                continueWithAnotherList();
                break;
            case 5:
                System.out.println("**********ASCENDING SIZE-COLOR-FABRIC ORDER**********");
                Collections.sort(tShirt, new SizeComparatorAsc()
                        .thenComparing(new ColorComparatorAsc()
                                .thenComparing(new FabricComparatorAsc())));
                dg.printData(tShirt);
                dg.underline();

                System.out.println("**********DESCENDING SIZE-COLOR-FABRIC ORDER**********");
                Collections.sort(tShirt, new SizeComparatorDesc()
                        .thenComparing(new ColorComparatorDesc()
                                .thenComparing(new FabricComparatorDesc())));
                dg.printData(tShirt);

                continueWithAnotherList();
                break;

        }
    }

//        Collections.sort(tShirt, new Comparator<TShirt>() {
//            @Override
//            public int compare(TShirt o1, TShirt o2) {
//                return o1.getSize().compareTo(o2.getSize());
//            }
//        });
//        dg.printData(tShirt);
}
