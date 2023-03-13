import java.util.Scanner;

/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
*/

public class guia_if {

    public static void main(String[] args) {

        //Inicio de todo programa
        System.out.println("////////////////////////");
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        //Terminamos de definir e ingresar todo

        //Empezamos oon las preguntas
        if (num1 > 25 && num2 > 25) {                              //Si el primer numero y el segundo son mayor a 25
            System.out.println("Ambos numeros son mayor a 25"); //Imprime esto
        } else if (num1 > 25) {                                    //Sino, pregunta si el primer numero es mayor a 25
            System.out.println("Primer numero (" + num1 +") es mayor a 25");           //V = imprime esto
        } else if (num2 > 25){                                     //Sino pregunta por el segundo
            System.out.println("Segundo numero (" + num2 + ") es mayor a 25");           //V = this
        } else {
            System.out.println("Ningun numero es mayor a 25");  //Si no cumple con ninguna condicion de arriba
        }
        entrada.close();
    }
}