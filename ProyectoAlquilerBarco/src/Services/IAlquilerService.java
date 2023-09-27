package Services;

import Entity.Alquiler;
import Entity.Barco;

public interface IAlquilerService {
    public double calcularModulo();
    public double calcularPrecioAlquiler(Alquiler alquiler);
}
