import java.util.Scanner;
/*
Este programa lê o nome de 5 frutas, armazena em um carrinho de compras e ao final da entrada dos 5 itens
exibe a lista completa
 */

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        int i = 0, j;
        String [] carrinho_de_compras = new String[5];
        Scanner tec = new Scanner(System.in);

        while (i < 5) {
            System.out.printf("Informe o nome da fruta desejada %n");
            carrinho_de_compras[i]= tec.next();
            i++;
        }

        System.out.printf("%nAs frutas escolhidas são: ");
        for (j = 0; j < 5; j++) {
            System.out.print(carrinho_de_compras[j]+" ");
        }
    }
}
