//Autor: Julian Felipe Velasco Lopez 
package metodos;

import java.util.Scanner;

public class Metodos {

  
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner (System.in);
  
        ConretornoConparametro FormatoFecha = new ConretornoConparametro();
        
        int Dia=0;
        int Mes=0;
        int Año=0;
        String Retorno = "";
        
        System.out.println("Ingrese el Dia de nacimiento");
        Dia = Sc.nextInt();
        System.out.println("Ingrese el Mes de nacimiento");
        Mes = Sc.nextInt();
        System.out.println("Ingrese el Año de nacimiento");
        Año = Sc.nextInt();
        Retorno = FormatoFecha.Edad(Mes);
        
        System.out.println("Usted nacio el "+ Dia +" de "+ Retorno +" de "+ Año);
        
    }
    
}
