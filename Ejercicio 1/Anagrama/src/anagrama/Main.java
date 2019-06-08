/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

import static anagrama.Anagrama.anagrama;
import java.util.Scanner;

/**
 *
 * @author Jorge.Payan
 */
public class Main {
    
    public static void main(String args[]){
        
            Scanner myObj = new Scanner(System.in);
            //Ingresa primera Cadena 
            System.out.println("Introduzca Primera cadena");
            String input1 = myObj.nextLine();
            //Ingresa Segunda Cadena
            System.out.println("Introduzca Segunda cadena");
            String input2 = myObj.nextLine();
		anagrama(input1, input2);
    }
    
}
