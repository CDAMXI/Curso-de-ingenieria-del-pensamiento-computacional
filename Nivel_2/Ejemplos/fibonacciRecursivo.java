package Nivel_2.Ejemplos;

public class fibonacciRecursivo {
    public static void main(String[] args) {
        int n = 10; // Cambia este valor para calcular otros números de Fibonacci
        System.out.println("El número Fibonacci en la posición " + n + " es: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {return n;}
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
