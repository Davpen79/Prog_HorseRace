public class Race {
    Horse horse1;
    Horse horse2;
    Horse horse3;
    Horse horse4;

    RaceCourseView raceCourseView;

    int turn;

    private final int trackLenght;

    public Horse getHorse1() {
        return horse1;
    }

    public Horse getHorse2() {
        return horse2;
    }

    public Horse getHorse3() {
        return horse3;
    }

    public Horse getHorse4() {
        return horse4;
    }

    public Race(String name1, String name2, String name3, String name4, int trackLenght) {
        horse1 = new Horse(name1);
        horse2 = new Horse(name2);
        horse3 = new Horse(name3);
        horse4 = new Horse(name4);
        this.trackLenght = trackLenght;
        this.raceCourseView = new RaceCourseView();
        turn = 0;
    }


    public int getTrackLenght() {
        return trackLenght;
    }

    public void start() {

        RaceCourseView.showRace(this);
        raceCourseView.continueRace();
        turn++;

        while(true) {
            horse1.move();
            horse2.move();
            horse3.move();
            horse4.move();
            RaceCourseView.showRace(this);

            if(isRaceFinished()){
                break;
            }

            raceCourseView.continueRace();
            turn += 1;
        }

        raceCourseView.showWinner(this);

    }

    public boolean isRaceFinished() {
        if(horse1.getPosition() >= trackLenght){
            return true;
        }
        if(horse2.getPosition() >= trackLenght){
            return true;
        }
        if(horse3.getPosition() >= trackLenght){
            return true;
        }
        if(horse4.getPosition() >= trackLenght){
            return true;
        }

        return false;
    }

    public int getTurn() {
        return this.turn;
    }

    public Horse getWinner(){
        Horse winner = horse1;

        if(horse2.getPosition() > winner.getPosition()){
            winner = horse2;
        }
        if(horse3.getPosition() > winner.getPosition()){
            winner = horse3;
        }
        if(horse4.getPosition() > winner.getPosition()){
            winner = horse4;
        }

        return winner;

    }
}
