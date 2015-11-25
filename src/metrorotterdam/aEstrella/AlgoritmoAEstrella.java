package metrorotterdam.aEstrella;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import metrorotterdam.classes.IArista;
import metrorotterdam.classes.Nodo;

/**
 *
 * @author Tuxt
 */
public class AlgoritmoAEstrella {
    
    private Nodo origen, meta;
    
    private int capacidad = 5;
    private PriorityQueue<Nodo> listaAbierta = new PriorityQueue<Nodo>(capacidad,
            new Comparator<Nodo>() {
                @Override
                /*
                 Ordenamos la cola según el valor de su coste final
                 */
                public int compare(Nodo i, Nodo j){
                    if (i.getF() > j.getF())
                        return 1;
                    else if (i.getF() < j.getF())
                        return -1;
                    else 
                        return 0;
                }
            });
    private ArrayList<Nodo> listaCerrada = new ArrayList<Nodo>();
    
    
    public AlgoritmoAEstrella(Nodo origen, Nodo meta){
        this.origen = origen;
        this.meta = meta;
    }
    
    public void ejecutar(){
        if(origen.getNombre().equals(meta.getNombre())){                        // Origen y destino iguales
            meta.setAntecesor(meta);
            return;
        }
        
        boolean encontrado = false;
        origen.calculaValores(meta);
        listaAbierta.add(origen);
        
        while (!listaAbierta.isEmpty() && !encontrado) {
            Nodo actual = listaAbierta.poll();
            
            actual.calculaValores(meta);
            listaCerrada.add(actual);
            
            /*
             Si el nodo actual es la meta lo añadimos a la lista cerrada
             y terminamos
             */
            if (actual.equals(meta)) {
                encontrado = true;
                continue;
            }
             
            /*
             Vamos a explorar cada uno de los adyacentes del nodo actual
             */
            for (IArista a : actual.getAdyacentes()) {
                Nodo dest = actual.equals(a.getDestino())? a.getOrigen() : a.getDestino();
 
                /*
                 Si el nodo esta en la lista cerrada pasamos
                 */
                if (listaCerrada.contains(dest))  // NODO EN LISTA CERRADA
                    continue;
 
                /*
                Si el nodo esta en la lista abierta, comprobamos G's
                Si procede, adoptamos nodo y recalculamos
                Lo dejamos en la lista abierta para posterior exploracion
                */
                if (listaAbierta.contains(dest)) {     // NODO EN LISTA ABIERTA
                    listaAbierta.remove(dest);
                    
                    Nodo antecesorBackUp = dest.getAntecesor();
                    double originalG = dest.getG();
                    dest.setAntecesor(actual);
                    dest.calculaValores(meta);
                    if(dest.getG()>=originalG){     // Si no mejora lo dejamos como estaba
                        dest.setAntecesor(antecesorBackUp);
                        dest.calculaValores(meta);
                    }
                    
                    listaAbierta.add(dest);
                }else{                          // NODO EN NINGUNA LISTA
                    dest.setAntecesor(actual);
                    dest.calculaValores(meta);
                    listaAbierta.add(dest);
                }
            }
        }
    }
}
