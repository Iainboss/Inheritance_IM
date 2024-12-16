package Ex2_MusicFestival;

 class SmallStageEvent extends Event {

     public String genre;
     public String artist2;
     public SmallStageEvent(String name, String type, String a,String g) {
         super(name, type);
       artist2 = a;
            genre = g;


     }




     public void printSmallStage(){

         System.out.println("Performing artists: " + super.getEventName()  + ", with " + artist2+ " playing " + genre);
     }
 }
