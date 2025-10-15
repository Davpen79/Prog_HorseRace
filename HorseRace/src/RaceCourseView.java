import java.util.Scanner;

public class RaceCourseView {

    public static void showRace(Race r) {

        System.out.println("===============================");
        System.out.println("===========TURNO " + r.getTurn() + "=============");
        System.out.println("===============================");
        System.out.println();
        showTrack(r.getHorse1(), r.getTrackLenght());
        showTrack(r.getHorse2(), r.getTrackLenght());
        showTrack(r.getHorse3(), r.getTrackLenght());
        showTrack(r.getHorse4(), r.getTrackLenght());

    }

    public static void showTrack(Horse horse, int trackLenght) {

        String trackString = "";
        for (int i = 0; i < horse.getPosition(); i++){
            trackString += "=";
        }

        trackString += getHorseImage(horse);

        for (int i = 0; i < trackLenght - horse.getPosition(); i++){
            trackString += "-";
        }
        System.out.println(trackString);

    }

    public static char getHorseImage(Horse horse) {
        return horse.getName().charAt(0);
    }

    public static void resuelveApuesta(Horse winner, Apuesta apues) {

        boolean apuestaGanada = false;
        String nombreGanador = winner.getName();
        Horse caballoApuesta = apues.getCaballo();
        String nombreCaballoApuesta = caballoApuesta.getName();

        if(winner.getName().equals(apues.getCaballo().getName())){
            apuestaGanada = true;
        }

        if(apuestaGanada){
            System.out.println("Apuesta ganada: " + (apues.getDinero() * 2));
        }else{
            System.out.println("Apuesta perdida: " + apues.getDinero());
        }
    }

    public void continueRace() {

        System.out.println("Pulsa cualquier boton para continuar la carrera");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public void showWinner(Race race) {

        Horse winner = race.getWinner();
        System.out.println("El ganador es: " + winner.getName());

    }

    public  static Apuesta crearApuesta(Race race){

        //caballo elegido
        System.out.println("Dime por que caballo apuestas");
        System.out.println("1. " + race.getHorse1().getName());
        System.out.println("2. " + race.getHorse2().getName());
        System.out.println("3. " + race.getHorse3().getName());
        System.out.println("4. " + race.getHorse4().getName());

        Scanner sc = new Scanner(System.in);
        int caballoSeleccionado = sc.nextInt();
        Horse horse;
        if(caballoSeleccionado == 1){
            horse = race.getHorse1();
        } else if (caballoSeleccionado == 2) {
            horse = race.getHorse2();
        } else if (caballoSeleccionado == 3) {
            horse = race.getHorse3();
        } else if (caballoSeleccionado == 4) {
            horse = race.getHorse4();
        } else {
            //si el usuario mete un error
            horse = race.getHorse1();
        }

        //pedir dinero
        System.out.println("Cuanto dinero apuestas?");
        double dinero = sc.nextDouble();
        Apuesta apuesta = new Apuesta(horse, dinero);
        return apuesta;
    }
}
