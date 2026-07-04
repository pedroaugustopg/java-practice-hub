package app;

import area.MainArea;
import contador.MainContador;
import fatorial.MainFatorial;
import escreva.MainFormatador;
import jogador.MainJogador;
import maiornumero.MainMaiorNumero;
import sorteio.MainSorteio;
import voto.MainVoto;

public class Main {

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n========================================");
            System.out.println("           JAVA EXERCISES");
            System.out.println("========================================");
            System.out.println("1 - Área do Terreno");
            System.out.println("2 - Contador");
            System.out.println("3 - Formatador de Mensagens");
            System.out.println("4 - Fatorial");
            System.out.println("5 - Ficha do Jogador");
            System.out.println("6 - Maior Número");
            System.out.println("7 - Sorteio e Soma dos Pares");
            System.out.println("8 - Verificador de Voto");
            System.out.println("0 - Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");

            opcao = Entrada.SCANNER.nextInt();
            Entrada.SCANNER.nextLine();

            System.out.println();

            switch (opcao) {
                case 1:
                    MainArea.executar();
                    break;

                case 2:
                    MainContador.executar();
                    break;

                case 3:
                    MainFormatador.executar();
                    break;

                case 4:
                    MainFatorial.executar();
                    break;

                case 5:
                    MainJogador.executar();
                    break;

                case 6:
                    MainMaiorNumero.executar();
                    break;

                case 7:
                    MainSorteio.executar();
                    break;

                case 8:
                    MainVoto.executar();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                Entrada.SCANNER.nextLine();
            }

        } while (opcao != 0);
        Entrada.SCANNER.close();
    }
}