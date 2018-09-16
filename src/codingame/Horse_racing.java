package codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Horse_racing {

    public static void main(String args[]) {
        Integer currentResult = null;
        Integer Result = 999999;

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Integer[] tablica = new Integer[N];
        for (int i = 0; i < N; i++) {
            int kon = in.nextInt();
            tablica[i] = kon;

        }
        Arrays.sort(tablica);
        for (int i = tablica.length - 2; i >= 0; i--) {
            currentResult = tablica[i+1] - tablica[i];
            if(Result > currentResult) {
                Result = currentResult;
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Result);
    }
}