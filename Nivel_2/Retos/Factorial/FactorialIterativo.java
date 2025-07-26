public class FactorialIterativo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(String.format("El factorial de %d es %d", n, Factorial(n)));
    }

    public static long Factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
