package Nivel_3.Ejemplos;

import java.util.*;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = kbd.nextInt();
        if(numero < 0){System.out.println("Haz introducido un número negativo");}
        else if(numero > 0){System.out.println("Haz introducido un número positivo");}
        else{System.out.println("Haz introducido el número cero");}
        kbd.close();
    }
}
