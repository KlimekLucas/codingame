package codingame;


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class ChuckNorris {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String Binary;
        char[] tablica = MESSAGE.toCharArray();
        boolean first = true;
        char previous = 'd';
        for (int j = 0; j < tablica.length; j++) {


            Integer ASCI = Integer.valueOf( tablica[j]);
            //     System.out.println(ASCI);
            Binary = Integer.toBinaryString(ASCI);
            char[] tablicaBinarna = Binary.toCharArray();
            if (tablicaBinarna.length == 7 ) {
                Binary = Integer.toBinaryString(ASCI);
                tablicaBinarna = Binary.toCharArray();
            }else {
                Binary =  0 +  Integer.toBinaryString(ASCI);
                tablicaBinarna = Binary.toCharArray();
            }
            //   char[] tablicaBinarna = Binary.toCharArray();

            for (int i = 0; i < tablicaBinarna.length; i++) {
                char current = tablicaBinarna[i];


                if (current == previous) {
                    System.out.print("0");
                    previous = current;
                } else {
                    if (current == '0') {
                        if (first) {
                            System.out.print("00 0");
                            first = false;
                        }else
                            System.out.print(" 00 0");
                        previous = current;
                    } else {
                        if (first) {
                            System.out.print("0 0");
                            first = false;
                        }else
                            System.out.print(" 0 0");
                        previous = current;
                    }


                    // Write an action using System.out.println()
                    // To debug: System.err.println("Debug messages...");

                    // System.out.println("answer");
                }
            }
        }
    }
}




