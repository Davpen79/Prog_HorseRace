//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {


        Race r = new Race("Twilight Sparkle", "Applejack", "Rainbow Dash", "Fluttershy", 50);
        //primero gestiono apuesta

        Apuesta apu = RaceCourseView.crearApuesta(r);

        //después empiezo la carrera
        r.start();

        Horse winner = r.getWinner();

        //la carrera acabo
        RaceCourseView.resuelveApuesta(winner, apu);

    }
}