import java.util.Scanner;

/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("//////////////////");
        int limite, numeros;
        int suma = 0;
        System.out.println("Ingrese el limite de ingresos: ");
        limite = entrada.nextInt();

        System.out.println("Ingrese los numeros a sumar: ");        
        while (suma < limite) {
            numeros = entrada.nextInt();
            suma = suma + numeros;
        }
        System.out.print("Suma total sobrepasó el limite: " + suma);
        entrada.close();
    }
}
