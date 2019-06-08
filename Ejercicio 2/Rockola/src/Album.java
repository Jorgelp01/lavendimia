
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge.Payan
 */
public class Album {
    
    private Cancion Canciones[];
    private String nombre;
    
    public Album(Cancion[] Canciones,String nombre){
        this.Canciones = Canciones;
        this.nombre = nombre;
    }

    public Cancion[] getCanciones() {
        return Canciones;
    }

    public void setCanciones(Cancion[] Canciones) {
        this.Canciones = Canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
