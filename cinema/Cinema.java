package Week5_A;

public class Cinema {

    Screen screens[];

    Cinema(int numScreens) {
        screens = new Screen[numScreens];
        screens[0]=new Screen("sc1","a");
        screens[1]=new Screen("sc2","b");
        screens[2]=new Screen("sc3","c");
        screens[3]=new Screen("sc4","d");
        screens[4]=new Screen("sc5","e");
    }

}
