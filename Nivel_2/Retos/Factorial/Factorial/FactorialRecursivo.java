package Factorial;

import java.util.*;

public class FactorialRecursivo{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int n = kbd.nextInt();
        System.out.println(String.format("El factorial de %d es %d", n, Factorial(n)));
        kbd.close();
    }

    public static long Factorial(int n){
        if(n < 0){return -1;}
        if(n == 0 || n == 1){return 1;}
        return n * Factorial(n - 1);
    }
}
