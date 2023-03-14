import java.util.Scanner;

/*
 * Crear un programa que dado un número determine si es par o impar.
 */

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("///////////////////////");
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
        entrada.close();
    }
}
