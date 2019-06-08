

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge.Payan
 */
public class Cancion {
    
    private String Letra;
    private int Duracion;
    private String Nombre;
    
    public Cancion (String Nombre,String Letra,int Duracion){
        this.Duracion = Duracion;
        this.Nombre = Nombre;
        this.Letra = Letra;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
