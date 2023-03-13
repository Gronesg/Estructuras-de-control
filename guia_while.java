import java.util.Scanner;

/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

public class guia_while {
    
    public static void main(String [] args) {
        
        System.out.println("///////////////////////");
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese la nota entre 0 y 10: ");
        nota = entrada.nextInt();

        //Inicio ciclo while
        while (nota < 0 || nota > 10) {                                                 //Mientras la nota ingresada este fuera de rango
            System.out.print("Nota ingresada fuera de rango, ingrese nuevamente: "); //Le pide ingresar otra vez
            nota = entrada.nextInt();
        }
        System.out.println("La nota es: " + nota);
        entrada.close();
    }
}
