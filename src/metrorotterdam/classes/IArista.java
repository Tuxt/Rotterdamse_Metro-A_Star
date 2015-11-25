package metrorotterdam.classes;

import javafx.scene.shape.Line;

/**
 *
 * @author Tuxt
 */
public interface IArista {
    public double getCoste();
    public Nodo getOrigen();
    public Nodo getDestino();
    public Line getLinea();
}
