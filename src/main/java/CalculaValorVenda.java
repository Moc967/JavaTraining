import java.util.Locale;
import java.util.Scanner;

/*
Este programa calcula o valor de venda sugerido com base no custo do produto.
 */

public class CalculaValorVenda {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe valor do produto");

        double custo = tec.nextDouble();
        double valorVenda;
        double margemVenda;

        if (custo <20) {
            margemVenda = 0.45;
        }else{
            margemVenda = 0.30;
            }

        valorVenda = custo*(1 + margemVenda);
        System.out.printf(Locale.forLanguageTag("pt-BR"), "%nO valor de venda sugerido é R$ %.2f%n", valorVenda);
    }
}
