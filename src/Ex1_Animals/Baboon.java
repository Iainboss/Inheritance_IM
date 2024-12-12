package Ex1_Animals;

public class Baboon extends Animal {

    int numBerries;
String name;

    public Baboon(String name, int n, String c) {
  super(name);
        numBerries = n;
        name = c;
    }

    public String toString(){

        return name + " eats " + numBerries + " per day";
    }

}
