package Ex1_Animals;

import java.util.ArrayList;
public class Ex1_Main {

    public static void run(){

        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(new Animal("Diego") );
        allAnimals.add(new Dog("Fido") );
        allAnimals.add(new Rotweiller("Sigma")  );
        allAnimals.add(new Shihtzu("Fineshyt"));
        allAnimals.add( new Trout( "Flopper"));
        allAnimals.add(new Baboon("Chuckles", 750,"ape")  );

//        for (int i = 0; i < allAnimals.size(); i++) {
////            System.out.println(allAnimals.get(i));
//            allAnimals.get(i).talk();
//        }
System.out.println("What do the dogs say?");
        for (int i = 0; i < allAnimals.size(); i++) {

            if( allAnimals.get(i) instanceof Dog  ){
                allAnimals.get(i).talk();
            }

        }

        System.out.println(allAnimals.get(5));

        Animal a = new Rotweiller("AngryDog");

    }//run
}//Ex1_Main
