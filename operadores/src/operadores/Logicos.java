/*Autor: Julian Felipe Velasco Lopez*/
package operadores;

import java.util.Scanner;

public class Logicos {

    public static void main(String[] args) {
        
    Scanner Sc = new Scanner (System.in);
    
    int ValorCompra = 0;
    int Dia = 0;
    int Edad = 0;
    int TotalFinal = 0;
    String Ciudad ="";
    
    
        System.out.println("Ingrese la sede del Supermercado");
        Ciudad = Sc.next();
        System.out.println("Ingrese el dia de la compra");
        Dia = Sc.nextInt();
        System.out.println("Ingrese la edad del cliente");
        Edad = Sc.nextInt();
        System.out.println("Ingrese el valor de la compra");
        ValorCompra = Sc.nextInt();
        
       if (Ciudad.equals("Bogota") || Ciudad.equals("BOGOTA") || Ciudad.equals("bogota")){
           if (Dia == 30 || Dia == 15){
               if (ValorCompra >= 50000){
                   TotalFinal = (int) (ValorCompra * 0.9);
                   System.out.println("El vaor de la compra es: "+ ValorCompra);
                   System.out.println("Tiene un 10% de descuento");
                   System.out.println("El valor final es: "+ TotalFinal);
                   
               }else{
                   System.out.println("El valor de su compra es de: "+ ValorCompra);
                   System.out.println("El valor de su compra no alcaza para el descuento");
             }
               }else if (Dia == 5){
                  System.out.println("Ingrese la edad del cliente");
                  Edad = Sc.nextInt();
                  if(Edad >=65){
                      TotalFinal = (int) (ValorCompra * 0.95);
                      System.out.println("Elvalor de la compra es: "+ ValorCompra);
                      System.out.println("Tiene un descuento del 5%");
                      System.out.println("El valor final de la compra es" + TotalFinal);
                      
                  }else{
                      System.out.println("El valor de su compra es: "+ ValorCompra);
                      System.out.println("La edad no cumple con el descuento");
                  }
                       }else{
                   System.out.println("El valor de su compra es de: "+ ValorCompra);
                   System.out.println("La fecha nop cumple para el descuento");
                   
                  }
               }else if(!Ciudad.equals("BOGOTA") || !Ciudad.equals("Bogota") || !Ciudad.equals("bogota")){
                   System.out.println("El valor de la compra es: "+ ValorCompra);
                   System.out.println("La sede no cumple para el descuento");
                   
               }
           
       
        }
    }

    
    

