package TwoD_Arrays;


import Utilities.Library;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere =createVSquare(alphabet);
        printSquare(vigenere);

//DECIPHERING: WHERE IS CHAR[KEY] == CHAR[ENCRYPTED MESSAGE]
        System.out.println("What is your message?");
        String message = Library.input.nextLine();

       StringBuilder keyStream = keyStream(message);

        for (int i = 0; i < message.length(); i++) {
char letter = (char) (char) alphabetConv(message.charAt(i));
char letter2 = (char) (char) alphabetConv(keyStream.charAt(i));



                    System.out.print(vigenere[letter][letter2]);





        }


    }



    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
        for (int row = 0; row < alphabet.length; row++) {

            for(int col = 0; col<alphabet.length; col++) {
              square[row][col] = alphabet[(row + col) % alphabet.length];
            }

            }


//code to be written

        return square;

    }//createVSquare

    public static void printSquare(char[][] square) {
        for (int row = 0; row < square.length; row++) {

            for (int col = 0; col < square[row].length; col++) {

                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }



    }//end printSquare

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }

    public static char getChar(char[][] arr, int rowNum, int colNum){
//
return arr[rowNum][colNum];
    }
    public static StringBuilder keyStream (String message){
String keyword = "SCONA";
StringBuilder keyStream  = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {


           keyStream.append(keyword.charAt(i % keyword.length()));

        }
     return keyStream;
    }

     public static int alphabetConv (char letter){
letter = Character.toUpperCase(letter);
        return letter - 'A';
    }



}//end class
