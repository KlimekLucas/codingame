package codingame;


import java.util.*;
        import java.io.*;
        import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class ShadowsOfTheKnight {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building. /szer
        int H = in.nextInt(); // height of the building./wys
        int N = in.nextInt(); // maximum number of turns before game over.
        double X0 = in.nextInt();
        double Y0 = in.nextInt();
        double    maxX = W;
        double    maxY = H;
        double    minX = 0;
        double    minY = 0;
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)


            if (bombDir.equals( "DR")){

                minY = Y0;
                Y0 = (Math.ceil((minY + maxY)/2));
                minX = X0;
                X0 = (Math.ceil((minX + maxX)/2));
            }
            else if (bombDir.equals( "UR")){

                maxY = Y0;
                Y0 = (Math.floor((maxY+ minY)/2));

                minX = X0;
                X0 = (Math.ceil((minX + maxX)/2));
            }
            else if (bombDir.equals( "UL")){

                maxY = Y0;
                Y0 = (Math.floor((maxY + minY)/2));

                maxX = X0;
                X0 = (Math.round((maxX + minX)/2));
            }
            else if (bombDir.equals( "DL")){

                minY = Y0;
                Y0 = (Math.floor((minY + maxY)/2));
                maxX = X0;
                X0 = (Math.ceil((maxX + minX)/2));
            }


            else if (bombDir.equals( "D")){
                minY = Y0;
                Y0 = (Math.ceil((minY + maxY)/2));

            }

            else if (bombDir.equals( "R")){
                minX = X0;
                X0 = (Math.ceil((minX + maxX)/2));

            }

            else if (bombDir.equals( "U")){

                maxY = Y0;
                Y0 = (Math.floor((maxY + minY)/2));


            }

            else if (bombDir.equals( "L")){

                maxX = X0;
                X0 = (Math.floor((maxX + minX)/2));

            }

            System.out.println((int)X0+" "+(int)Y0);
        }
    }
}