import java.util.*;

public class ParImpar{
    public static void main(String[] args) {
        try (Scanner kbd = new Scanner(System.in)) {
            int valor = 0;
            while(valor < 0){
                System.out.print("Introduce un valor: ");
                valor = kbd.nextInt();
                if(valor < 0){
                    System.out.println("El valor es negativo. Finalizando programa.");
                    return;
                }
                else if(valor % 2 == 0){
                    System.out.println("El valor " + valor + " es par.");
                } else {
                    System.out.println("El valor " + valor + " es impar.");
                }
            }
        }
    }
}
