

public class PracCinema {
    PracScreen screen[];

    PracCinema(int length){
        screen=new PracScreen[length];
        for (int i = 0; i < screen.length; i++) {
            screen[i]=new PracScreen("src"+i, "a"+i);
        }
        
       
    }

   public void display(int length){
    System.out.println(screen[length].toString());
   }
}
