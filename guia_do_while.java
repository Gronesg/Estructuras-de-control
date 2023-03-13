import java.util.Scanner;

/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */


public class guia_do_while {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("///////////////////");
        int numero;
        int cant_numeros = 1;
        int suma = 0;


        do {
            System.out.print("Ingrese el numero a sumar: ");
            numero = entrada.nextInt();
            if (numero > 0){
                suma = suma + numero;
            }
            if (numero == 0){
                System.out.println("Se capturó el numero 0");
                break;
            }            
            cant_numeros++;
        } while (cant_numeros < 20);

        System.out.println("La suma de los numeros ingresados es de: " + suma);
        entrada.close();
    }
}
