package codingame;



import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
public class Thor {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        int currentX = initialTX;
        int currentY = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            //skosy
            if (currentX > lightX && initialTY > currentY){
                currentY = currentY -1;
                currentX = currentX -1;
                System.out.println("NW");

            }else if (currentY < lightY && currentX < lightX){
                currentY = currentY +1;
                currentX = currentX +1;
                System.out.println("SE");

            }else if (currentY > lightY && currentX < lightX){
                currentY = currentY -1;
                currentX = currentX +1;
                System.out.println("NE");

            }else if (currentX > lightX && currentY < lightY){
                currentY = currentY +1;
                currentX = currentX -1;
                System.out.println("SW");



                //boki
            }else if (currentX > lightX){
                currentX = currentX -1;
                System.out.println("W");
            }else if (currentX < lightX){
                currentX = currentX +1;
                System.out.println("E");

                //gora dol
            }else if (currentY > lightY){
                currentY = currentY -1;
                System.out.println("N");
            }else if (currentY < lightY){
                currentY = currentY +1;
                System.out.println("S");
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            //  System.out.println("SE");
        }
    }
}



