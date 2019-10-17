/*
Autor: Julian Felipe Velasco Lopéz
 */
package operadores;

import java.util.Scanner;

public class Calculadora {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
       
       Scanner input = new Scanner(System.in);
       
       
         int RespuestaUsuario= 0;
        int Operacion= 0;
        
        System.out.println("==== Bienvenido =====");
        System.out.println("--Digite una opción--");
        System.out.println("Menu principal------1");
        System.out.println("Cerrar sesion-------2");
        System.out.println("=====================");
        System.out.println();
        System.out.print("==> ");
        RespuestaUsuario=sc.nextInt();


        
        if (RespuestaUsuario == 1){
            MenuPrincipal();
        }
    }

    private static void MenuPrincipal (){
        Scanner sc = new Scanner(System.in);
        
        int Operacion = 0;
        System.out.println("=== Menu principal ===");
        System.out.println("--Digite una opcion---");
        System.out.println("Sumar----------------1");
        System.out.println("Restar---------------2");
        System.out.println("Multiplicar----------3");
        System.out.println("Dividir--------------4");
        System.out.println("Cerrar sesion--------5");
        System.out.println("======================");
        System.out.println();
        System.out.print("==> ");
        Operacion=sc.nextInt();
        Operaciones(Operacion);
    }

    private static void Operaciones(int Operacion){
        int num1 = 0;
        int num2 = 0;
        int Resultado = 0;
        Scanner sc = new Scanner(System.in);
        
        if(Operacion == 1){
            System.out.println();
            System.out.println("==Estas en la operacion suma==");
            System.out.println();
            System.out.println("---Digite el primer numero----");
            System.out.print("=> ");
            num1=sc.nextInt();
            System.out.println();            
            System.out.println("---Digite el segundo numero---");
            System.out.print("=> ");
            num2=sc.nextInt();
            System.out.println();
            System.out.print("=====Resultado: ");
            Resultado =num1+num2;
            System.out.println(Resultado);
            SubMenu(Operacion);
        }

        while(Operacion == 2){
            
            System.out.println("Estas en la operacion resta");
            System.out.println("Digite el primer numero");
            num1=sc.nextInt();
            System.out.println("Digite el segundo numero");
            num2=sc.nextInt();
            Resultado=num1-num2;
            System.out.println(Resultado);
            SubMenu(Operacion);
        }

        while(Operacion == 3){
            System.out.println("Estas en la operacion multiplicacion");
            System.out.println("Digite el primer numero");
            num1=sc.nextInt();
            System.out.println("Digite el segundo numero");
            num2=sc.nextInt();
            Resultado=num1*num2;
            System.out.println(Resultado);
            SubMenu(Operacion);
        }

        while(Operacion == 4){
            System.out.println("Estas en la operacion dividir");
            System.out.println("Digite el primer numero");
            num1=sc.nextInt();
            System.out.println("Digite el segundo numero");
            num2=sc.nextInt();
            Resultado=num1+num2;
            System.out.println(Resultado);
            SubMenu(Operacion);
        }
    }        
    private static void SubMenu(int Operacion){
        int RespuestaUsuario = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu segundario");
        System.out.println("Digite una opcion");
        System.out.println("Repetir la operacion---1");
        System.out.println("Menu principal---------2");
        System.out.println("Cerrar sesion----------3");
        RespuestaUsuario=sc.nextInt();
        
        if (RespuestaUsuario == 1){
            Operaciones(Operacion);
        }
        else if(RespuestaUsuario == 2){
            MenuPrincipal();
        }
        else if(RespuestaUsuario == 3){
            System.out.println("Gracias");
        }
    }
}