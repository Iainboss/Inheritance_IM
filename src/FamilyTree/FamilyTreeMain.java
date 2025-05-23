package FamilyTree;

import Utilities.Library;

public class FamilyTreeMain {


    public static void run() {

        Person person1 = new Person("Bobbie", "Mexico");
//(generation I)
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Japan"));
// (Generation II)
        person1.children.get(0).addChild(new Person("Zain", "Japan"));
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
//generation 3
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

//Add Me + my children
        person1.children.get(1).addChild(new Person("Iain", "Canada"));
        person1.children.get(1).children.get(0).addChild(new Person("Iainboss", "Canada"));
        person1.children.get(1).children.get(0).addChild(new Person("Iainmanager", "Canada"));
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Iainemployee", "Canada"));
        person1.children.get(1).children.get(0).children.get(1).addChild(new Person("Iainworker", "Canada"));


        //MARKING ADD
        person1.addChild(new Person("Hans", "Canada")); //- 4th child
        person1.children.get(3).addChild(new Person("Alan", "England"));  //Hans' child

        while (true) {
            System.out.println("\n\nPress 1 to print the family\nPress 2 to count the number of family members\nPress 3 to print Canadians\nPress 4 to print descendents (print from here)");
            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                printFamily(person1, null);
            }
            if (choice == 2) {
                System.out.println(countFamily(person1));
            }
            if(choice ==3){
                printCanadians(person1);
            }
            if(choice == 4){
                System.out.println("What is the name of the person you are looking for?");
                String name = Library.input.nextLine();
                searchToPrint(person1,name);

            }


        }


    }

    public static void printCanadians(Person person) {

        if(person.country.equalsIgnoreCase("canada")){
            System.out.println(person.name);

        }
        if(person.children != null){
            for (int i = 0; i < person.children.size(); i++) {
                printCanadians(person.children.get(i));
            }
        }


    }

    public static void printFamily(Person p, Person parent) {

        String parentName;
        if (parent == null) {
            parentName = "No Parent";
        } else {
            parentName = parent.name;
        }

        System.out.println(p.name + " (Parent: " + parentName + ")");


        for (int i = 0; i < p.children.size(); i++) {
            Person child = p.children.get(i);
            printFamily(child, p);
        }

    }

    public static int countFamily(Person person) {

int counter =0;

counter ++;

if(person.children != null){
    for (int i = 0; i < person.children.size(); i++) {
     counter += countFamily(person.children.get(i));
    }
}
return counter;

}




    public static void printFromHere(Person p){
        System.out.println(p.name);
        if(p.children !=null){
            for (int i = 0; i < p.children.size(); i++) {
                printFromHere(p.children.get(i));
            }
        }

    }



    public static boolean searchToPrint(Person currentPerson, String name) {
        //Only for the printFromHere method *****************************
        if (currentPerson.getName().equalsIgnoreCase(name)) {
            printFromHere(currentPerson);
            return true;
        }
        else {


            for (int i = 0; i < currentPerson.children.size(); i++) {
                Person descendant = currentPerson.children.get(i);
                if (searchToPrint(descendant, name)) {
                    return true;
                }
            }
        }
        return false;
    }

}



