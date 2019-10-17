/* Autor: Julian Felipe Velasco Lopez */
package arreglos;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
     
    Scanner imput = new Scanner (System.in);
    
    int [] Notas = new int[5];
    int promedio = 0;
    int Sum = 0;
    for (int Estudiantes = 0; Estudiantes <= 4; Estudiantes ++){
        System.out.print("Ingrese nota del estudiante" + (Estudiantes + 1) + ":");
        Notas[Estudiantes] = imput.nextInt();
    }
    for (int Estudiantes = 0; Estudiantes <= 4; Estudiantes ++){
        System.out.println("La nota del estudiante" + (Estudiantes + 1) + "es:" + Notas[Estudiantes]);
        Sum = Sum + Notas[Estudiantes];
    }  
    promedio = Sum/5;
        System.out.println("El promedio de las nota es:" + promedio);
    }
    
}
