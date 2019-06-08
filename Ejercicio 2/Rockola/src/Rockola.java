
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge.Payan
 */

public class Rockola {
    
    
    //Cancion cancion;
    Cancion[] canciones;
    
    //Album album;
    Album[] albumes;
    
    //Artista artista;
    Artista[] artistas;
    Scanner scan;
    
    boolean salir;
    
    
    //private String empresa;
    
    public Rockola (){    
    }
    public void start(String Dj){
        
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("-------------"+ Dj + "---------------------------");
        System.out.println("-------------PRESENTANDO------------------------------");
        try {
            Thread.sleep(6000);
            } 
            catch (InterruptedException ex) {
            }
        populateAll();
        StartLoop();  
    }
    
    
    
    public void populateAll(){
        
      canciones = new Cancion[10];
      albumes = new Album[10];
      artistas = new Artista[5];
        
      for (int i=0;i<=9;i++){
          canciones[i] = new Cancion("Cancion"+i,"Letra"+i,20);
      }  
      for (int i=0;i<=9;i++){
          albumes[i] = new Album(canciones,"AlbumEjemplo"+i);
      }
      for (int i=0;i<=4;i++){
          artistas[i] = new Artista(albumes,"artista"+(i+1));
      }
  
    }
    public void StartLoop(){
        
        int opcion;
        
        salir = false;
        scan = new Scanner(System.in);
        
        while(!salir){
            
            System.out.println("Seleccione un input para el artista");
            System.out.println("0: Para salir");
            System.out.println("1: "+artistas[0].getNombre());
            System.out.println("2: "+artistas[1].getNombre());
            System.out.println("3: "+artistas[2].getNombre());
            System.out.println("4: "+artistas[3].getNombre());
            System.out.println("5: "+artistas[4].getNombre());
            opcion = scan.nextInt();
            
            switch(opcion){
                case 1:
                    menuArtistas(artistas[0]);
                    //somecode
                    break;
                case 2:
                    menuArtistas(artistas[1]);
                    //
                    break;
                case 3:
                    menuArtistas(artistas[2]);
                    //
                    break;
                case 4:
                    menuArtistas(artistas[3]);
                    //
                    break;
                case 5:
                    menuArtistas(artistas[4]);
                    //
                    break;
                case 0:
                    //Exit
                    salir = true;
                default:
                    System.out.println("Solo numeros de 1 a 5");
            }
 
        }

    }
    public void menuArtistas(Artista artista){
        
        albumes = artista.getAlbumes();
        
        boolean breakk = false;
        int option;
        
        while(!breakk){
            System.out.println("Seleccione un input para el Album");
            System.out.println("0: Para salir");
            System.out.println("1: "+albumes[0].getNombre());
            System.out.println("2: "+albumes[1].getNombre());
            System.out.println("3: "+albumes[2].getNombre());
            System.out.println("4: "+albumes[3].getNombre());
            System.out.println("5: "+albumes[4].getNombre());
            System.out.println("6: "+albumes[5].getNombre());
            System.out.println("7: "+albumes[6].getNombre());
            System.out.println("8: "+albumes[7].getNombre());
            System.out.println("9: "+albumes[8].getNombre());
            System.out.println("10: "+albumes[9].getNombre());
            
            option = scan.nextInt();
            
            switch(option){
                case 1:
                    menuAlbumes(albumes[0]);
                    //somecode
                    break;
                case 2:
                    menuAlbumes(albumes[1]);
                    //somecode
                    break;
                case 3:
                    menuAlbumes(albumes[2]);
                    //somecode
                    break;
                case 4:
                    menuAlbumes(albumes[3]);
                    //somecode
                    break;
                case 5:
                    menuAlbumes(albumes[4]);
                    //somecode
                    break;
                case 6:
                    menuAlbumes(albumes[5]);
                    //somecode
                    break;    
                case 7:
                    menuAlbumes(albumes[6]);
                    //somecode
                    break;
                case 8:
                    menuAlbumes(albumes[7]);
                    //somecode
                    break;    
                case 9:
                    menuAlbumes(albumes[8]);
                    //somecode
                    break;
                case 10:
                    menuAlbumes(albumes[9]);
                    //somecode
                    break;    
                case 0:
                    //Exit
                    breakk = true;
                default:
                    System.out.println("Solo numeros de 1 a 10");
            }

        }
        
        
        
        
    }
    public void menuAlbumes(Album album){
        
        boolean breakk = false;
        int option;
        
        canciones = album.getCanciones();
        
        while(!breakk){
            System.out.println("Seleccione un input para el  seleccionado");
            System.out.println("0: Para salir");
            System.out.println("1: "+canciones[0].getNombre());
            System.out.println("2: "+canciones[1].getNombre());
            System.out.println("3: "+canciones[2].getNombre());
            System.out.println("4: "+canciones[3].getNombre());
            System.out.println("5: "+canciones[4].getNombre());
            System.out.println("6: "+canciones[5].getNombre());
            System.out.println("7: "+canciones[6].getNombre());
            System.out.println("8: "+canciones[7].getNombre());
            System.out.println("9: "+canciones[8].getNombre());
            System.out.println("10: "+canciones[9].getNombre());
            
            option = scan.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("La cancion dura: "+ canciones[0].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[0].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 2:
                    System.out.println("La cancion dura: "+ canciones[1].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[1].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 3:
                    System.out.println("La cancion dura: "+ canciones[2].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[2].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 4:
                    System.out.println("La cancion dura: "+ canciones[3].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[3].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 5:
                    System.out.println("La cancion dura: "+ canciones[4].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[4].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 6:
                    System.out.println("La cancion dura: "+ canciones[5].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[5].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;   
                case 7:
                    System.out.println("La cancion dura: "+ canciones[6].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[6].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 8:
                    System.out.println("La cancion dura: "+ canciones[7].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[7].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;   
                case 9:
                    System.out.println("La cancion dura: "+ canciones[8].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[8].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;
                case 10:
                    System.out.println("La cancion dura: "+ canciones[9].getDuracion());
                    System.out.println("La letra de la cancion: "+ canciones[9].getLetra());
                    System.out.println ("-------ENJOY------");
                    try {
                        Thread.sleep(5000);
                        } 
                        catch (InterruptedException ex) {
                        }
                    break;    
                case 0:
                    //Exit
                    breakk = true;
                default:
                    System.out.println("Solo numeros de 1 a 10");
            }

        }
        
    }
    
    
    
}
