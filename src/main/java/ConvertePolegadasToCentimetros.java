import java.util.Locale;
import java.util.Scanner;

/*
Este programa converte medidas em polegadas para centímetros
 */

public class ConvertePolegadasToCentimetros {
    public static void main(String[] args) {
        final double POL_TO_CENTIMETROS = 2.54;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o valor em polegadas que deseja converter para centímetros");
        float polegadas = tec.nextFloat();

        double centimetros = polegadas / POL_TO_CENTIMETROS;
        System.out.printf(Locale.US, "%n %.2f polegadas equivalem a ", polegadas);
        System.out.printf(Locale.forLanguageTag("pt-BR"), " %.2f centímetros %n", centimetros);

    }
}
