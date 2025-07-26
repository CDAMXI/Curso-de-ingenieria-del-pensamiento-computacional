public class ParImpar{
    public static void main(String[] args) {
        int valor = 5;
        do{
            if(valor % 2 == 0){System.out.println("El valor " + valor + " es par.");}
            else {System.out.println("El valor " + valor + " es impar.");}
        }while(valor < 0);
        System.out.println(valor + " es negativo.");
    }
}
