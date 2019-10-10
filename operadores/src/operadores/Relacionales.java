/* Autor: Julian Felipe Velasco Lopez */
package operadores;

import java.util.Scanner;

public class Relacionales {

    public static void main(String[] args) {
        
        Scanner Sc=new Scanner (System.in);
        int Numero1=0;
        int Numero2=0;
        
        System.out.println("Digite el primer numero:");
        Numero1=Sc.nextInt();
        
        System.out.println("Digite el segundo numero:");
        Numero2=Sc.nextInt();
        
        if (Numero1 == Numero2){
            System.out.print("Los numeros son iguales");
        }
        if (Numero1 < Numero2){
            System.out.print("El Numero1 es menor al Numero2");
        }   
        if (Numero1 > Numero2){
            System.out.print ("El Numero1 es mayor al Numero2");
        }
    }
}
