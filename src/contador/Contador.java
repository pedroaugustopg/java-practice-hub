package contador;

public class Contador {

    public static void contar(
            int inicio,
            int fim,
            int passo
    ) {

        // Garante que o passo seja positivo
        if (passo < 0) {
            passo = -passo;
        }

        // Evita passo igual a zero
        if (passo == 0) {
            passo = 1;
        }

        System.out.printf(
                "Contagem de %d até %d, com intervalo de %d em %d%n",
                inicio, fim, passo, passo
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (inicio < fim) {
            for (int contador = inicio; contador <= fim; contador += passo) {

                System.out.print(contador + " ");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            for (int contador = inicio; contador >= fim; contador -= passo) {

                System.out.print(contador + " ");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("FIM!");
    }
}
