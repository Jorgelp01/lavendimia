package anagrama;
import java.util.*;


public class Anagrama {

	public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            //Ingresa primera Cadena 
            System.out.println("Introduzca Primera cadena");
            String input1 = myObj.nextLine();
            //Ingresa Segunda Cadena
            System.out.println("Introduzca Segunda cadena");
            String input2 = myObj.nextLine();
		anagrama(input1, input2);

	}
	
	public static void anagrama(String input1, String input2){
        //Remueve todos los espacios en blanco
        String  s1= input1.replaceAll("\\s", "");
 
        String s2 = input2.replaceAll("\\s", "");
        
        //Valor de validacion si ambas cadenas no son iguales
        boolean status;
        
        //Valida si las longitudes de la primera y segunda cadena son dieferentes
        if(s1.length() != s2.length())
        {
            status = false;
        }else {
            //Convierte los caracteres en arreglos
 
            char[] s1Array = s1.toLowerCase().toCharArray();
 
            char[] s2Array = s2.toLowerCase().toCharArray();
 
            //Acomoda ambos caracteres en el arreglo
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Revisa si los dos cuentan con los mismos caracteres 
 
            status = Arrays.equals(s1Array, s2Array);
        }
        if(status){
            System.out.println(s1+" y "+s2+" son anagramas");
        } else {
            System.out.println(s1+" y "+s2+" NO son anagramas");
        }
    }
	
	
}

