/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge.Payan
 */
public class Artista {
    private Album[] Albumes;
    private String Nombre;
    
    public Artista(Album Albumes[],String Nombre){
        this.Albumes = Albumes;
        this.Nombre = Nombre;
    }

    public Album[] getAlbumes() {
        return Albumes;
    }

    public void setAlbumes(Album[] Albumes) {
        this.Albumes = Albumes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
