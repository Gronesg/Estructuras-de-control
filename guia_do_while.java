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

        //Inicializamos las variables
        int numero;             //numeros a ingresar
        int cant_numeros = 1;         //contador de numeros ingresados
        int suma = 0;           //aloja la suma total

        //Inicio de ciclo do while
        do {
            System.out.print("Ingrese el numero a sumar: "); //Se pide ingresar en cada iteracion al usuario
            numero = entrada.nextInt();
            //Control de numero positivo
            if (numero > 0){                          //Si el numero es positivo
                suma = suma + numero;                 //se va a acumular en la variable suma

            /*Control de condicion para salir del ciclo do while
            En este caso, que el numero ingresado sea 0*/
            } else if (numero == 0){
                System.out.println("Se capturó el numero 0");
                break;                                 //Comando para salir del ciclo
            }            
            cant_numeros++;                            //Incremento de contador de numeros ingresados
        } while (cant_numeros < 20);

        System.out.println("La suma de los numeros ingresados es de: " + suma);     //Muestra la suma total de todos los numeros ingresados
        entrada.close();
    }
}
