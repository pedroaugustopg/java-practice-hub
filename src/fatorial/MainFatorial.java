package fatorial;

import app.Entrada;

public class MainFatorial {

    public static void executar() {

        System.out.print("Digite um número: ");
        int numero = Entrada.SCANNER.nextInt();

        System.out.println("Realizando cálculo...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Fatorial.calcular(numero, true));
    }
}