/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();

        int num3 = num1 + num2;
        System.out.println("La suma de los números ingresados es "+num3);
    }

}
