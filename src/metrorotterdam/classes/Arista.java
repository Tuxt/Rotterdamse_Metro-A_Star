package metrorotterdam.classes;

import javafx.scene.shape.Line;

/**
 *
 * @author Tuxt
 */
public class Arista implements IArista {
    
    private Nodo origen,destino;
    private double coste;
    private Line linea;
    
    public Arista(Nodo origen, Nodo destino, Line linea) {
        this.origen = origen;
        this.destino = destino;
        this.linea = linea;
        inicializaCoste();
    }
    
    private void inicializaCoste(){
        double diffX = origen.getPunto().getLayoutX() - destino.getPunto().getLayoutX();
        double diffY = origen.getPunto().getLayoutY() - destino.getPunto().getLayoutY();
        this.coste = Math.sqrt(diffX*diffX + diffY*diffY);
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
    public Line getLinea(){
        return linea;
    }
}
