package sorteio;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    public static void sorteia(
            ArrayList<Integer> lista
    ) {

        Random random = new Random();

        System.out.print("Sorteando valores... ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(100) + 1;
            lista.add(numero);
            System.out.print(numero + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void somaPar(
            ArrayList<Integer> lista
    ) {

        int soma = 0;
        for (int valor : lista) {
            if (valor % 2 == 0) {
                soma += valor;
            }
        }

        System.out.println("Lista: " + lista);
        System.out.println("Soma dos pares: " + soma);

    }
}