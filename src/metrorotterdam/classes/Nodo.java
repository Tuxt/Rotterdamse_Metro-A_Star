package metrorotterdam.classes;

import java.util.ArrayList;
import javafx.scene.shape.Circle;

/**
 *
 * @author Tuxt
 */
public class Nodo {
    
    private String nombre;
    private double g=0,h=0,f=0;
    private ArrayList<IArista> adyacentes;
    private Circle punto;
    private Nodo antecesor;
    
    public Nodo(String nombre, Circle punto){
        this.nombre = nombre;
        this.punto = punto;
        adyacentes = new ArrayList<>();
        this.antecesor = this;      // El mismo hasta que se diga otra cosa
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Circle getPunto(){
        return punto;
    }
    
    public double getG(){
        return g;
    }
    public double getH(){
        return h;
    }
    public double getF(){
        return f;
    }
    public Nodo getAntecesor(){
        return antecesor;
    }
    public ArrayList<IArista> getAdyacentes(){
        return adyacentes;
    }
    
    public void setG(double g){
        this.g = g;
    }
    public void setH(double h){
        this.h = h;
    }
    public void setF(double f){
        this.f = f;
    }
    public void setAntecesor(Nodo antecesor){
        this.antecesor = antecesor;
    }
    public void setAdyacentes(ArrayList<IArista> adyacentes){
        this.adyacentes = adyacentes;
    }
    
    public void addAdyacente(IArista a){
        adyacentes.add(a);
    }
    
    // CALCULOS
    public void calculaG(){
        // Buscamos arista que conecta con antecesor
        IArista temp = null;
        for(IArista a : adyacentes)
            if(a.getDestino().equals(antecesor) || a.getOrigen().equals(antecesor))
                temp = a;
        
        // Calculamos G
        if(temp != null)
            this.g = antecesor.getG() + temp.getCoste();
        if(this.equals(this.antecesor))
            this.g = 0.0;
    }
    
    public void calculaH(Nodo meta){
        int diffX = (int) punto.getLayoutX() - (int) meta.getPunto().getLayoutX();
        int diffY = (int) punto.getLayoutY() - (int) meta.getPunto().getLayoutY();
        this.h = Math.sqrt(diffX*diffX + diffY*diffY);
    }
    
    public void calculaF(){
        this.f = this.g + this.h;
    }
    
    public void calculaValores(Nodo meta){
        calculaG();
        calculaH(meta);
        calculaF();
    }
}
