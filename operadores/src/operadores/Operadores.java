/*
Nombre: Julian Felipe Velasco Lopez
 */
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        // suma
        Scanner input = new Scanner (System.in);
        System.out.print("====Suma====");
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        System.out.print("Ingrese el primer numero:");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2 = input.nextInt();
        res = num1 + num2;
         System.out.print("Resultado:" + res);
         
         //resta
          System.out.print("====resta====");
          int nume1 = 0;
          int nume2 = 0;
          int resp2 = 0;
           System.out.print("Ingrese el primer numero:");
        nume1 = input.nextInt();
        System.out.print("Ingrese el segundo numero:");
        nume2 = input.nextInt();
        resp2 = nume1 - nume2;
         System.out.print("Resultado:" + resp2);
         
         //multiplicacion
        System.out.print("====multiplicacion====");
          int numer1 = 0;
          int numer2 = 0;
          int respu2 = 0;
           System.out.print("Ingrese el primer numero:");
        numer1 = input.nextInt();
        System.out.print("Ingrese el segundo numero:");
        numer2 = input.nextInt();
        respu2 = numer1 * numer2;
         System.out.print("Resultado:" + respu2);
         
         //division
         System.out.print("====division====");
          int numero1 = 0;
          int numero2 = 0;
          int respue2 = 0;
           System.out.print("Ingrese el primer numero:");
        numero1 = input.nextInt();
        System.out.print("Ingrese el segundo numero:");
        numero2 = input.nextInt();
        respue2 = numero1 / numero2;
         System.out.print("Resultado:" + respue2);
         
        
    }
    
}
