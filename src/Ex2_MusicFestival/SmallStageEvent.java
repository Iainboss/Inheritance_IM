package Ex2_MusicFestival;

 class SmallStageEvent extends Event {

     public String genre;
     public String artist2;
     public SmallStageEvent(String name, String type, String a,String g) {
         super(name, type);
         a = artist2;
            g = genre;


     }
public String toString(){
return artist2 + " " + genre;
}



     public void printSmallStage(){

         System.out.println("Performing artists "  + ", wallahi " + artist2+ " playing " + genre);
     }
 }
