package voto;

import java.time.LocalDate;

public class VerificadorVoto {

    public static String verificar(
            int anoNascimento
    ) {

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        if (idade < 16) {
            return "Com " + idade + " anos: NÃO VOTA!";
        } else if (idade < 18 || idade > 70) {
            return "Com " + idade + " anos: VOTO OPCIONAL!";
        } else {
            return "Com " + idade + " anos: VOTO OBRIGATÓRIO!";
        }
    }
}