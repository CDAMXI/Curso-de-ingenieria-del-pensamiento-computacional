public class FactorialIterativo {
    public static void main(String[] args) {
        java.util.Scanner kbd = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int n = kbd.nextInt();
        System.out.println(String.format("El factorial de %d es %d", n, Factorial(n)));
        kbd.close();
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
