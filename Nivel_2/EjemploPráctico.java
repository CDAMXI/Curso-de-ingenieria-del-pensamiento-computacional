package Nivel_2;

public class EjemploPráctico {
    public static void main(String[] args){
        double fun1 = 3 + 4 / 2;
        double fun2 = (3 + 4) / 2;
        System.out.println("Resultado de la función 1 (Sin paréntesis): " + fun1);
        System.out.println("Resultado de la función 2 (Con paréntesis): " + fun2);

        /*
         * El resultado de la función 1 es 5.0 y el de la función 2 es 3.5
         * El motivo de porque la función 1 sale como 5.0 es por el tipo de variables que se están utilizando,
         * ya que al ser enteros, la división se hace entre enteros y no entre decimales. Por lo tanto, el 
         * resultado de 4/2 es 2 y luego se suma a 3, dando como resultado 5.0.
         */
        }
}
