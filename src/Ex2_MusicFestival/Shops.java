package Ex2_MusicFestival;

public class Shops extends NonMusicEvent {

    public double revenue;

    public Shops(String name, String type, String loc, double r) {
        super(name, type, loc);
        revenue = r;
    }


    public void printShop(){
        System.out.println(super.getEventName() + " is at " + super.getLocation() + ". Total revenue: "+revenue );
    }

 public  String  printRev(){
    return super.getEventName() + " $" + revenue;
 }



}
