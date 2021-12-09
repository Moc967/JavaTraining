import java.util.Locale;
import java.util.Scanner;

/*
Este programa converte Reais para dolares baseado na cotação do dolar do dia
 */

public class ConversorReaisDolares {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o valor atual da cotação do dolar americano");
        float exRate = tec.nextFloat();

        System.out.println("Informe quantos reais deseja converter para dolares americanos");
        float reais = tec.nextFloat();

        float reaisToDolar = reais / exRate;

        System.out.printf(Locale.forLanguageTag("pt-BR"), "%nR$ %.2f ", reais);
        System.out.printf(Locale.forLanguageTag("pt-BR"),", usando a taxa de conversão de %,2f, equivalem a $", exRate );
        System.out.printf(Locale.US,"%.2f %n%n", reaisToDolar );

    }
}
