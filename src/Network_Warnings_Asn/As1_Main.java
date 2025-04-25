package Network_Warnings_Asn;

import Utilities.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class As1_Main {

    public static Scanner input = new Scanner( System.in );

    public static void main(String[] args) {

        ArrayList <Message> allMessages = new ArrayList();


        System.out.println("Assign 1 Network Messages");

        //ADD EXAMPLE WARNINGS
        allMessages.add( new Message("Client3: repeated login failure"));
        allMessages.add( new Message("Client2:filed password reset on file"));
        allMessages.add( new Message("Server1: file not found"));
        allMessages.add( new Message("Server3: ping not returned"));
        allMessages.add( new Message("Server1:write file error on disk DSK1"));
        allMessages.add( new Message("Server2:disk failure on DSK2"));
        allMessages.add( new Message("Server2:diskette diskette"));
        allMessages.add( new Message("Client3:    diskette disk"));
        allMessages.add( new Message("Router1: missing packet"));
        allMessages.add( new Message("PC4: power surge detected"));
        allMessages.add(new Message("Mri4: nopingerror"));
            while (true) {
                System.out.println("\nWhat do you want to do?");
                System.out.println("1. Add Message");
                System.out.println("2. Print All Messages");
                System.out.println("3. Scan for Error Messages");
                System.out.println("4. EXIT");
                int option = Library.input.nextInt();
                Library.input.nextLine();
                System.out.println();



                if (option == 1) {

                    System.out.println("Message?");
                    String newMsg = Library.input.nextLine();

                    allMessages.add(new Message(newMsg));

                    System.out.println("Message added.");

                } else if (option == 2) {
                    for (int i = 0; i < allMessages.size(); i++) {
                        System.out.println(allMessages.get(i).printMessage());
                    }
                } else if (option == 3) {
                    System.out.println("Warning?");
                    String keyword = Library.input.nextLine();

                    for (int i = 0; i < allMessages.size(); i++) {
                        if(allMessages.get(i).scanWarning(keyword)){
                            System.out.println(allMessages.get(i).printMessage() + " ");
                        }
                    }
                } else if (option == 4) {
                    System.out.println("Logging out. Good Bye.");
                    break;
                } else {
                    System.out.println("That is not an available option");
                }

            }//while




    }//main



}//class

