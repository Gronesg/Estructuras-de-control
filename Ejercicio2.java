import java.util.Scanner;

/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("////////////////////");
        String frase;
        System.out.print("Ingrese la frase secreta: ");
        frase = entrada.nextLine();
        if (frase.equals("eureka")){        //En lugar de corroborar caracter por caracter, se usa la funcion equals()
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        entrada.close();
    }
}
