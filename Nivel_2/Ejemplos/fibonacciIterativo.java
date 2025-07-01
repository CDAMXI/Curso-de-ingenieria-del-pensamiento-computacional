public class fibonacciIterativo {
    public static void main(String[] args) {
        int n = 10; // Cambia este valor para calcular otros números de Fibonacci
        System.out.println("El número Fibonacci en la posición " + n + " es: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        int result = 0;
        for (int i = n; i >= 0; i--) {result =  result + i;}
        return result;
    }
}
