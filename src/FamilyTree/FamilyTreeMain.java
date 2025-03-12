package FamilyTree;

public class FamilyTreeMain {



    public static void run(){

Person person1 = new Person("Bobbie", "Mexico");
//(generation I)
person1.addChild( new Person("Susan", "Canada"));
person1.addChild( new Person("Jill", "Canada"));
person1.addChild( new Person("Bobette", "Japan"));
// (Generation II)
person1.children.get(0).addChild(new Person ("Zain", "Japan"));
person1.children.get(2).addChild(new Person("Bob III", "Belise"));
person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
//generation 3
person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

//Add Me + my children
        person1.children.get(1).addChild(new Person ("Iain", "Canada"));
        person1.children.get(1).children.get(0).addChild(new Person("Iain's kid1", "Canada"));
        person1.children.get(1).children.get(0).addChild(new Person("Iain's kid2", "Canada"));
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Iain's grandson", "Canada"));
        person1.children.get(1).children.get(0).children.get(1).addChild(new Person("Iain's granddaughter", "Canada"));

        System.out.println(person1.children.get(1).children.get(0).children.get(0).children.get(0));


        printFamily(person1,null);

    }
    public static int countFamily(Person ptemp){
        int num = 0;

        return num;
    }

    public static void printCanadians(Person ptemp){

    }
public static void printFamily(Person p, Person parent){
    // Base case: If the current person is null, return (stop recursion)
    if (p == null) {
        return;
    }

    // Check if the person has a parent (parent is null or not)
    String parentName = parent == null ? "No Parent" : parent.name;  // Simple check for parent

    // Print the current person's name and their parent's name (if they have one)
    System.out.println(p.name + " (Parent: " + parentName + ")");

    // Recursively traverse the children (go down the tree)
    for (Person child : p.children) {
        printFamily(child, p);  // Call the function for each child, passing the current person as the parent
    }

}

}
