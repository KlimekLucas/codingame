package codingame;


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
public class Descent {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int number = 0;
            int max = 0;
            for (int i = 0; i < 8; i++) {


                int mountainH = in.nextInt();

                if (max <  mountainH){
                    max = mountainH;
                    number = i;

                    // represents the height of one mountain.
                }

                // Write an actmion using System.out.println()
                // To debug: System.err.println("Debug messages...");
            }
            System.out.println(number); // The index of the mountain to fire on.
        }
    }
}

