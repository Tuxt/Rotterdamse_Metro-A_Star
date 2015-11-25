package metrorotterdam.classes;

import javafx.scene.shape.Line;

/**
 *
 * @author Tuxt
 */
public class Transbordo implements IArista {
    
    private Nodo origen,destino;
    private double coste;
    
    public Transbordo(Nodo origen, Nodo destino){
        this.origen = origen;
        this.destino = destino;
        this.coste = 0.1;
    }
    
    public Transbordo(Nodo origen, Nodo destino, double coste){
        this.origen = origen;
        this.destino = destino;
        this.coste = coste;
    }
    
    @Override
    public double getCoste(){
        return coste;
    }
    @Override
    public Nodo getOrigen(){
        return origen;
    }
    @Override
    public Nodo getDestino(){
        return destino;
    }

    @Override
    public Line getLinea() {
        return null;
    }
}
