import java.util.Scanner;


/*
 * Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
1- Sumar
2- Restar
3- Multiplicar
4- Dividir
5- salir
Elija opcion:
 */

public class Ejercicio6 {
    
    public static void main(String[] args) {
        System.out.println("/////////////////");
        Scanner entrada = new Scanner(System.in);
        int num1, num2, b;
        int suma, resta, mult;
        float div;
        String opcion;

        System.out.println("Ingrese los numeros a operar: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        b = 0;

        //MENU DE OPCIONES

        do {
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            opcion = entrada.next();
            switch (opcion.toLowerCase()) {
                case "1":
                    System.out.println("Suma");
                    suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case "2":
                    System.out.println("Resta");
                    resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case "3":
                    System.out.println("Multiplicacion");
                    mult = num1 * num2;
                    System.out.println("La multiplicacion es: " + mult);
                    break;
                case "4":
                    System.out.println("Division");
                    div = num1 / num2;
                    System.out.println("La division es: " + div);
                    break;
                case "5":
                    //Decision si salir o no
                    System.out.println("Salir");
                    System.out.println("¿Esta seguro que desea salir? (S/N)");
                    opcion = entrada.next();
                    if (opcion.equalsIgnoreCase("s")){   //En caso de querer salir, bandera = 1
                        System.out.println("Saliendo...");
                        b = 1;
                        break;
                    } else {
                        //opcion = "";
                        break;
                    }
                default:
                    System.out.println("Opcion invalida, ingrese nuevamente: ");
                    break;



            }
        } while (b != 1);    //Tuve que usar una bandera, porque si lo hacia con <<opcion>>, no salía del switch.

        entrada.close();
    }
}
