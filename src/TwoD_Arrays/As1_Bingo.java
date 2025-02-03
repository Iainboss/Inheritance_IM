package TwoD_Arrays;

import Utilities.Library;

public class As1_Bingo {
    public static void run() {

        int[][] bingoCard = new int[5][5];

        bingoCard[0] = getArray(5, 1, 15);
        bingoCard[1] = getArray(5, 16, 30);
        bingoCard[2] = getArray(5, 31, 45);
        bingoCard[3] = getArray(5, 46, 60);
        bingoCard[4] = getArray(5, 61, 75);


        for (int row = 0; row < bingoCard.length; row++) {

            for (int col = 0; col < bingoCard[row].length; col++) {

                System.out.print(bingoCard[row][col] + "\t");
            }
            System.out.println();
        }




        while(true) {

            System.out.println("Press ENTER to get a number");

          Library.input.nextLine();
                int number = Library.myRandom(1,75);
            System.out.println("Number is..... " + number);

            for (int row = 0; row < bingoCard.length; row++) {

                for (int col = 0; col < bingoCard[row].length; col++) {

                    if(bingoCard[row][col] == number){
                        bingoCard[row][col]=0;
                    }
                }

            }



            for (int row = 0; row < bingoCard.length; row++) {

                for (int col = 0; col < bingoCard[row].length; col++) {

                    System.out.print(bingoCard[row][col] + "\t");
                }
                System.out.println();
            }

            int Rowtotal = 0;
            for (int row = 0; row < bingoCard.length; row++) {

                System.out.println("TOTAL:" + Rowtotal);


                Rowtotal = 0;

                for (int col = 0; col < bingoCard[row].length; col++) {
                    Rowtotal += bingoCard[row][col];

                }
                System.out.println();
            }


        }


    }


        public static int[] getArray ( int length, int min, int max){
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = Library.myRandom(min, max);
            }
            return arr;
        }
    }

