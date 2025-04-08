public class Entrada {

    private String nomEvent;
    private double precEntrada;

    public Entrada(String nomEvent, double precEntrada) {
        this.nomEvent = nomEvent;
        this.precEntrada = precEntrada;
    }

    public void mostrarInformacion() {
        System.out.println("---> Evento: " + nomEvent + " --> Precio: $" + precEntrada);
    }
}
