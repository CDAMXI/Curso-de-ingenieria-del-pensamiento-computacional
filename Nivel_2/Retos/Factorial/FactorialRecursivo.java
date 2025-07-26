public class FactorialRecursivo{
    public static void main(String[] args){
        int n = 5;
        System.out.println(String.format("El factorial de %d es %d", n, Factorial(n)));
    }

    public static long Factorial(int n){
        if(n < 0){return -1;}
        if(n == 0 || n == 1){return 1;}
        return n * Factorial(n - 1);
    }
}
