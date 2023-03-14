import java.util.Scanner;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
*/


public class guia_for {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("/////////////////////");
    int num1, /*num2, num3, num4,*/ i; 
    int c = 1;   //cantidad de numeros

    /*num2 = entrada.nextInt();
    num3 = entrada.nextInt();
    num4 = entrada.nextInt();*/

    System.out.print("Ingrese cuatro numeros entre 1 y 20:");  //Se puede poner una condicion que solo sea un numero entre 1 y 20, y dentro de esa condicion todo lo demas.

    /*Se puede usar cuatro ingresos distintos, pero para que sea mas corto el programa lo hago con un do_while
     * que se encarga de pedir los 4 numeros e imprimir los asteriscos en cada ingreso de numero, no queda muy
     * estetico pero cumple.
     */
    
    do {         //Control de ingresos de solo 4 numeros
        System.out.println();
        //System.out.print("(" + c +"/4): ");
        num1 = entrada.nextInt();
         
        System.out.print(num1 + " ");
        for (i = 0 ; i < num1 ; i++){        //Ciclo for para la impresion de asteriscos
            System.out.print("*");
            
        }
        c++; //cantidad de numeros + 1
    } while (c <= 4);       //Fin ciclo while al llegar a 4 nuemeros ingresados

    entrada.close();
    }
}
