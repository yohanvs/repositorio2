
package Entity;
import Services.IAlquilerService;
import java.time.LocalDate;

public class Alquiler {

    private IAlquilerService iAlquilerServicio;
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler,
                    LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularPrecioAlquiler(Alquiler alquiler) {
        long diasOcupacion = fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay();
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }

}

