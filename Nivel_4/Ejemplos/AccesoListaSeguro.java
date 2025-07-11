package Nivel_4.Ejemplos;

import java.util.*;

public class AccesoListaSeguro {
    public static void main(String[] args) {
        List<String> estudiantes = Arrays.asList("Ana", "Luis", "Pedro", "Marta");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el número de estudiante (0 a 3): ");
            int indice = sc.nextInt();
            String nombre = estudiantes.get(indice);
            System.out.println("El estudiante seleccionado es: " + nombre);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. Solo hay " + estudiantes.size() + " estudiantes.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número entero.");
        } finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }
}
