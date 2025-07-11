import java.util.*;

public class ParImpar{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int valor = 0;
        do{
            System.out.print("Ingrese un valor: ");
            valor = kbd.nextInt();
            if(valor % 2 == 0){System.out.println("El valor " + valor + " es par.");}
            else {System.out.println("El valor " + valor + " es impar.");}
        }while(valor < 0);
        kbd.close();
        System.out.println(valor + " es negativo.");
    }
}
