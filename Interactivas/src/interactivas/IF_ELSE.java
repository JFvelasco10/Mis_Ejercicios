/* Autor: Julian Felipe Velasco Lopez
 */
package interactivas;

import java.util.Scanner;

public class IF_ELSE {

    public static void main(String[] args) {

        Scanner Nn = new Scanner(System.in);
        
        String Usuario = "JFvelasco";
        String Contraseña = "123456789";
        String UsuarioI = "";
        String ContraseñaI = "";
        
        System.out.println(",,,::::Ingresar Usuario::::,,,");
        UsuarioI = Nn.next();
        
        System.out.println(",,,::::Ingresar Contraseña::::,,,");
        ContraseñaI = Nn.next();
        
        if (Usuario.equals(UsuarioI) && Contraseña.equals(ContraseñaI)){
            System.out.println("Has ingresado de forma correcta, BIENVENIDO!!");
            
        }else{
                    System.out.println("Usuario o Contraseña incorrectas");
        
        }
    }
    
}
