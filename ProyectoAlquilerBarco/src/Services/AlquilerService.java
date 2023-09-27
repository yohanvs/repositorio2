package Services;

import Entity.Alquiler;

public class AlquilerService {
    public double calcularPrecioAlquiler(Alquiler alquiler) {
        long diasOcupacion = this.fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay();
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
}
