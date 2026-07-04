package area;

import app.Entrada;

public class MainArea {

    public static void executar() {

        System.out.println("=================================");
        System.out.println("      CONTROLE DE TERRENOS");
        System.out.println("=================================");

        System.out.print("Largura (m): ");
        double largura = Entrada.SCANNER.nextDouble();

        System.out.print("Comprimento (m): ");
        double comprimento = Entrada.SCANNER.nextDouble();

        double area = Terreno.calcularArea(largura, comprimento);

        System.out.printf(
                "%nO terreno com %.2fm de largura x %.2fm de comprimento possui %.2fm².%n",
                largura,
                comprimento,
                area
        );
    }
}

