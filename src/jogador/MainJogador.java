package jogador;

import app.Entrada;

public class MainJogador {

    public static void executar() {

        System.out.print("Digite o nome do jogador: ");
        String nome = Entrada.SCANNER.nextLine();

        System.out.print("Digite a quantidade de gols: ");
        String entrada = Entrada.SCANNER.nextLine();

        int gols;

        try {
            gols = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            gols = 0;
        }
        if (nome.trim().isEmpty()) {
            Jogador.fichaJogador(gols);
        } else {
            Jogador.fichaJogador(nome, gols);
        }
    }
}
