package voto;

import app.Entrada;

public class MainVoto {

    public static void executar() {

        System.out.print("Ano de nascimento: ");

        int nascimento = Entrada.SCANNER.nextInt();

        System.out.println("Analisando...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(VerificadorVoto.verificar(nascimento));

    }
}