/*
Autor: Julian Felipe Velasco Lopez
 */
package interactivas;

import java.util.Scanner;

public class WHILE {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int RespuestaUsuario=0;
        
  
        System.out.println("....:::Registro de Participantes:::....");
        System.out.println("Digite el numero de participantes");
        RespuestaUsuario=sc.nextInt();
        
        int NumeroParticipante = 1;
        int documento = 0;
        while (NumeroParticipante<= RespuestaUsuario){
            System.out.println("Participante N. "+ NumeroParticipante);
            System.out.println("Por favor ingrese su numero de documento: ");
            documento=sc.nextInt();
            NumeroParticipante++;
        }  
        System.out.println("fin del proceso");
    }
}

