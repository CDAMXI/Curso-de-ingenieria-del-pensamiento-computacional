package Nivel_5.Retos;

import java.util.*;

public class DividirDosNumeros {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int num1 = kbd.nextInt();
            System.out.print("Ingrese otro número entero: ");
            int num2 = kbd.nextInt();
            int resultado = num1 / num2; // División
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException  e) {System.out.println("Error: Debes introducir un número entero.");
        } catch (ArithmeticException e) {System.out.println("Error: División por cero no permitida.");}
        finally {
            kbd.close();
            System.out.println("Programa finalizado.");
        }
    }
}
