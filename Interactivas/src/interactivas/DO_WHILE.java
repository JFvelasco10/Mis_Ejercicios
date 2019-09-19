/*
Autor: Julian   Feipe Velasco Lopez */
package interactivas;

import java.util.Scanner;

public class DO_WHILE {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String ClaveUser = "hhhhh";
        String ClaveBD ="1234";
        int NumeroIntentos=1;
        
        System.out.println("====LOGIN====");
        do{
            if (NumeroIntentos > 1){
                System.out.println("Intento numero:" + NumeroIntentos);
            }
            
            System.out.print("Ingrese la clave: ");
            ClaveUser = entrada.next();
            NumeroIntentos++;
            
        }while(!ClaveUser.equals(ClaveBD) && NumeroIntentos < 4);
        
        if (NumeroIntentos == 4 && !ClaveUser.equals(ClaveBD)){
            System.out.println("Acceso no permitido");
        }
         else {
            System.out.println("Bienvenido");
        }
            
    }
    
}
