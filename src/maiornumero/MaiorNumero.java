package maiornumero;

public class MaiorNumero {

    public static void maior(
            int... numeros
    ) {

        int contador = 0;
        int maior = 0;

        System.out.println("======================================");
        System.out.println("Analisando os valores...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (int valor : numeros) {
            System.out.print(valor + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (contador == 0 || valor > maior) {
                maior = valor;
            }
            contador++;
        }

        System.out.println();
        System.out.println("Foram analisados " + contador + " valores.");

        System.out.println("O maior valor foi: " + maior);

    }
}
