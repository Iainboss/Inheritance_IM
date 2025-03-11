package TwoD_Arrays;


import Utilities.Library;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere =createVSquare(alphabet);
        printSquare(vigenere);

//DECIPHERING: WHERE IS CHAR[KEY] == CHAR[ENCRYPTED MESSAGE]
String key = "SCONA";
         System.out.println("Do you want a custom key?");
        String querry = Library.input.nextLine();
        if(querry.toLowerCase().contains("y")){
            System.out.println("What is your key? (All Caps)");
              key=Library.input.nextLine().toUpperCase();
        }
        System.out.println("What is your message?");
        String message = Library.input.nextLine();

       StringBuilder keyStream = keyStream(message,key);

        for (int i = 0; i < message.length(); i++) {
            int encryptedLetterIndex = alphabetConv(message.charAt(i));
            int keyLetterIndex = alphabetConv(keyStream.charAt(i));


            int decryptedLetterIndex = (encryptedLetterIndex - keyLetterIndex + 26) % 26;


            System.out.print(vigenere[decryptedLetterIndex][0]);
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



    public static StringBuilder keyStream (String message, String key){

StringBuilder keyStream  = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {


           keyStream.append(key.charAt(i % key.length()));

        }
     return keyStream;
    }

     public static int alphabetConv (char letter){
letter = Character.toUpperCase(letter);
        return letter - 'A';
    }



}//end class
