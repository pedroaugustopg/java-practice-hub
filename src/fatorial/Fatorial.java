package fatorial;

public class Fatorial {

    public static long calcular(
            int numero,
            boolean mostrar
    ) {

        long fatorial = 1;

        for (int contador = numero; contador > 0; contador--) {
            if (mostrar) {

                System.out.print(contador);

                if (contador > 1) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" = ");
                }
            }
            fatorial *= contador;
        }
        return fatorial;
    }
}