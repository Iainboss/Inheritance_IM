package TwoD_Arrays;

import Examples.Library;

import java.util.Arrays;

public class As1_Bingo {
public static void run(){
    char[] BINGO ={'B','I','N','G','O'};

    int[] rowB = getArray(5,1,15);
    int[] rowI = getArray(5,16,30);
    int[] rowN = getArray(5,31,45);
    int[] rowG = getArray(5,46,60);
    int[] rowO = getArray(5,61,75);


    for (int i = 0; i < BINGO.leg; i++) {

    }

    }






    public static int[] getArray(int length, int min, int max) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Library.myRandom(min, max);
        }
        return arr;
    }
}
