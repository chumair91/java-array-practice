
public class PracScreen {
    String screenId;
    String screenType;
    PracSeat seat[][];

    {
        seat = new PracSeat[10][];
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new PracSeat[i + 5];
        }

        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j] = new PracSeat("seat" + (i + 1) + (j + 1), false, 100, "standard");
            }
        }
        seat[1][1].setAvailable(true);
    }
    

    public PracScreen(String screenId, String screenType) {
        this.screenId = screenId;
        this.screenType = screenType;
    }
    public void displaySeats() {
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                System.out.println(seat[i][j]);
            }
        }
    }
public void displayAvailableSeats(){
    for (int i = 0; i < seat.length; i++) {
        for (int j = 0; j < seat[i].length; j++) {
            if (seat[i][j].isAvailable) {
                System.out.println(seat[i][j]);
            }
        }
    }
}
@Override
public String toString() {
    return "PracScreen [screenId=" + screenId + ", screenType=" + screenType + "]";
}


}
