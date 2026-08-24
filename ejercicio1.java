public class ejercicio1 {

    public static void main(String[] args) {

        ReservaAirbnb reserva = new ReservaAirbnb("Martin", 5, 50000);

        reserva.mostrardetalle();
    }
}

class ReservaAirbnb {

    private String nombreHuesped;
    private int noches;
    private double preciopornoche;

    public ReservaAirbnb(String nombreHuesped, int noches, double preciopornoche) {

        if (nombreHuesped == null || nombreHuesped.isEmpty() || noches <= 0 || preciopornoche <= 0) {
            throw new IllegalArgumentException("Valores invalidos");
        }

        this.nombreHuesped = nombreHuesped;
        this.noches = noches;
        this.preciopornoche = preciopornoche;
    }

    public double Calculartotal() {
        return noches * preciopornoche;
    }

    public void mostrardetalle() {

        System.out.println("huesped: " + nombreHuesped);
        System.out.println("noches: " + noches);
        System.out.println("total: $" + Calculartotal());
    }
}