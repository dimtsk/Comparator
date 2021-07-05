package com.dimtsk.assignment;

import java.util.Scanner;

public class InputValidators {

    static Scanner input = new Scanner(System.in);

    // CONTROLS IF THE USERS INPUT IS INVALID (NOT A NUMBER OR OUT OUR LIMITS SET)
    public static int controInput(int min, int max) {
        int result;
        do {
            while (true) {
                try {
                    String num = input.next();
                    int number = Integer.parseInt(num);
                    result = number;
                    break;
                } catch (Exception e) {
                    System.err.println("INVALID NUMBER TRY AGAIN");
                }
            }
            if (result < min || result > max) {
                System.err.println("INVALID INPUT. TRY AGAIN BETWEEN 1 AND 5");
            } else {
                return result;
            }
        } while (true);

    }

    //yes or no
    public static boolean yesOrNo() {
        boolean b = true;
        boolean result = false;
        while (b) {

            char c = input.next().charAt(0);
            if (c == 'Y' || c == 'y') {
                result = true;
                b = false;
            } else if (c == 'n' || c == 'N') {
                result = false;
                b = false;
            } else {
                System.err.println("INVALID INPUT. TRY AGAIN");

            }
        }
        return result;
    }

}
