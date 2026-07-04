package escreva;

public class FormatadorMensagem {

    public static void escreva(
            String mensagem
    ) {

        String linha = "~".repeat(mensagem.length() + 4);

        System.out.println(linha);
        System.out.println("  " + mensagem);
        System.out.println(linha);

    }
}