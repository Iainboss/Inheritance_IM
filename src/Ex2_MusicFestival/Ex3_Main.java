package Ex2_MusicFestival;
import java.util.ArrayList;
import Examples.Library;

public class Ex3_Main {
    public static void run() {
        ArrayList<Event> allEvents = new ArrayList<>();
        //MAIN STAGE EVENTS
        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Rolling Stones", "Music"));
        allEvents.add(new MainStageEvent("The Joker", "Comedy"));
        allEvents.add(new MainStageEvent("Shakespeare Troupe", "Play"));
        allEvents.add(new MainStageEvent("Drake", "Music"));
        //SMALL STAGE EVENTS
        allEvents.add(new SmallStageEvent("Jimmy", "Music", "John", "Country"));
        allEvents.add(new SmallStageEvent("Sigma", "Comedy", "Alpha", "Improv"));
        allEvents.add(new SmallStageEvent("Theo Von", "Comedy", "King Von", "Stand Up"));
        allEvents.add(new SmallStageEvent("Drake", "Music", "Kendrick", "Rap Battle"));
        allEvents.add(new SmallStageEvent("Country Boy", "Music", "Country Boy 2", "Country"));
        //NON MUSIC EVENTS
        allEvents.add(new Shops("FolkFest tokens", "Shop", "Truck 10", 563.2));
        allEvents.add(new Shops("FolkFest tokens", "Shop", "Truck 10", 563.2));
        allEvents.add(new Shops("Handmade Jewelry", "Shop", "Truck 5", 45.99));
        allEvents.add(new Shops("T-shirts", "Shop", "Truck 3", 25.0));
        allEvents.add(new Shops("Vintage Posters", "Shop", "Truck 7", 39.5));


        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(1)).addTech("Symphony Orchestra");
        ((MainStageEvent)allEvents.get(1)).addTech("Fireworks");
        ((MainStageEvent)allEvents.get(2)).addTech("Symphony Orchestra");
        ((MainStageEvent)allEvents.get(3)).addTech("Symphony Orchestra");
        ((MainStageEvent)allEvents.get(3)).addTech("PyroTechnics");




        while (true){

            System.out.println("Press 1 to add a new event");
int choice = Library.input.nextInt();
Library.input.nextLine();
if(choice == 1){
    System.out.println("Press 1 to add a main stage event, 2 to add a small stage event, 3 to add a shop");
    int answer = Library.input.nextInt();
    Library.input.nextLine();
    if(answer == 1){
        System.out.println("Name?");
        String name = Library.input.nextLine();
        System.out.println("Type?");
        String type = Library.input.nextLine();
        allEvents.add(new MainStageEvent(name, type));
    }
    else if(answer ==2){
        System.out.println("First artist name?");
        String firstArtist = Library.input.nextLine();
        System.out.println("Second artist name?");
        String secondArtist = Library.input.nextLine();
        System.out.println("Type?");
        String type = Library.input.nextLine();
        System.out.println("Genre?");
        String genre = Library.input.nextLine();

        allEvents.add(new SmallStageEvent(firstArtist,type,secondArtist,genre));
    }
    else if(answer ==3){
        System.out.println("Shop name?");
        String name = Library.input.nextLine();
        System.out.println("Type?");
        String type = Library.input.nextLine();
        System.out.println("Location?");
        String location = Library.input.nextLine();
        System.out.println("Revenue?");
        double revenue = Library.input.nextDouble();
        Library.input.nextLine();
        allEvents.add(new Shops(name, type, location, revenue));
    }



}

        }
//        for (int i = 0; i < allEvents.size(); i++) {
//            System.out.println(allEvents.get(i).getEventName());
//            if(allEvents.get(i) instanceof MainStageEvent) {
//                ((MainStageEvent) allEvents.get(i)).printTech();
//            }
//        }

//        ((SmallStageEvent)allEvents.get(3)).printSmallStage();
//        ((Shops) allEvents.get(4)).printShop();
    }
}
