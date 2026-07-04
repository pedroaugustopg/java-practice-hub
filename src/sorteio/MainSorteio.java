package sorteio;

import java.util.ArrayList;

public class MainSorteio {

    public static void executar() {

        ArrayList<Integer> numeros = new ArrayList<>();

        Sorteio.sorteia(numeros);

        Sorteio.somaPar(numeros);

    }
}