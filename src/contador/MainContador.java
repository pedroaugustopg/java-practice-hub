package contador;

import app.Entrada;

public class MainContador {

    public static void executar() {

        System.out.println("=================================");
        System.out.println("         CONTADOR");
        System.out.println("=================================");

        // Contagens automáticas
        Contador.contar(1, 10, 1);

        System.out.println();

        Contador.contar(10, 0, 2);

        System.out.println();

        // Contagem personalizada
        System.out.println("Personalize sua contagem!");

        System.out.print("Início: ");
        int inicio = Entrada.SCANNER.nextInt();

        System.out.print("Fim: ");
        int fim = Entrada.SCANNER.nextInt();

        System.out.print("Passo: ");
        int passo = Entrada.SCANNER.nextInt();

        System.out.println();

        Contador.contar(inicio, fim, passo);
    }
}
