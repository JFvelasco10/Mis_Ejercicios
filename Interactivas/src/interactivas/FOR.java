/*AUTOR: Julian Felipe Velasco Lopez*/
package interactivas;

import java.util.Scanner;

public class FOR {

    public static void main(String[] args) {
  
        Scanner sc=new Scanner(System.in);
        
        int chorizo=3000;
        int pincho=1500;
        int aceite=3500;
        int arroz=1000;
        int limon=2000;
        int cantidad=0;
        int total=0;
        int costo=0;
        int valor=0;
        int codigo=0;
        int acumulador=0;
        String reusu="si";
        
        
        while(reusu.equals("si")){
        System.out.println("1--chorizo(und)...3000$");
        System.out.println("2--pincho(und)...1500$");
        System.out.println("3--aceite(und)...1000$");
        System.out.println("4--arroz(und)...3500$");
        System.out.println("5--limon(und)...2000$");
        System.out.println("Ingrese el codigo del producto");
        codigo=sc.nextInt();
        System.out.println("Ingrese la cantidad");
        cantidad=sc.nextInt(); 
        switch(codigo){
            case 1: 
                total=chorizo*cantidad;
                acumulador +=total;
                    break;
            case 2:
                total=pincho*cantidad;
                acumulador +=total;
                    break;
            case 3:
                total=aceite*cantidad;
                acumulador +=total;
                    break;
            case 4:
                total=arroz*cantidad;
                acumulador +=total;
                    break;
            case 5:
                total=limon*cantidad;
                acumulador +=total;
                    break;
            default:
                System.out.println("Ingrese codigo valido");
                
        }
        System.out.println("deseas seguir comprando ingrese si; si no no");
        reusu=sc.next(); 
        }
        System.out.println("El valor total de la compra es de: "+acumulador);
    }
}