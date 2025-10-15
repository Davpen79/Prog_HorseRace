public class Apuesta {

    //atributos

    private Horse caballo;
    private double dinero;

    // getter y setter

    public Horse getCaballo() {
        return caballo;
    }

    public void setCaballo(Horse caballo) {
        this.caballo = caballo;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }


    // constructor

    public Apuesta(Horse caballo, double dinero) {
        this.caballo = caballo;
        this.dinero = dinero;
    }

}
