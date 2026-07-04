package jogador;

public class Jogador {

    public static void fichaJogador(
            String nome,
            int gols
    ) {

        System.out.println("O jogador " + nome + " marcou " + gols + " gol(s)");

    }

    public static void fichaJogador(
            int gols
    ) {

        fichaJogador("<desconhecido>", gols);

    }
}