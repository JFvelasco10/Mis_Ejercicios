/*
Autor: Julian Felipe Velasco Lopéz
 */
package operadores;

import java.util.Scanner;

public class Calculadora {
    
   public static void main(String[] args) {   
       
       Scanner input = new Scanner(System.in);
       
       
         System.out.println("======Calculadora======"); 
//Declaramos e inicializamos las variables
       
       int num1 = 0;
       int num2 = 0;
       int res = 0;
       int tpo = 0;
        
        //Moastramos las opciones al usuario para que escoja.
       System.out.println("1. Suma:");
          System.out.println("2. Resta:");
          System.out.println("3. Multipl cacion:");
          System.out.println("4.Division:");
          System.out.print("Seleccione el tipo de operacion:");
          tpo = input.nextInt();
          
          if (tpo > 0 && tpo < 5)
          {
         if (tpo == 1){
          System.out.println("Usted ha seleccionado una Suma:");
          res = num1 + num2;
         }
          System.out.println("Ingrese el primer numero:");
          num1 = input.nextInt();
          System.out.println("Ingrese el segundo numero:");
          num2 = input.nextInt();
       
       
         
         if (tpo == 2){
          System.out.println("Usted ha seleccionado una Resta:");
          res = num1 + num2;
         }
          System.out.println("Ingrese el primer numero:");
          num1 = input.nextInt();
          System.out.println("Ingrese el segundo numero:");
          num2 = input.nextInt();
         
         if (tpo == 3){
          System.out.println("Usted ha seleccionado una multiplicacion:");
          res = num1 + num2;
         }
          System.out.println("Ingrese el primer numero:");
          num1 = input.nextInt();
          System.out.println("Ingrese el segundo numero:");
          num2 = input.nextInt();
         if (tpo == 4){
          System.out.println("Usted ha seleccionado una division:");
          res = num1 + num2;
         }
          System.out.println("Ingrese el primer numero:");
          num1 = input.nextInt();
          System.out.println("Ingrese el segundo numero:");
          num2 = input.nextInt();
          
         System.out.println("Ingrese un numero valido:"); 
          }  
         
      System.out.println("El resultado es:" + res);
   }

    
}
