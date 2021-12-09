import java.util.Scanner;

/*
Este programa calcula o quadrado e cubo do maior e menor número, respectivamente
 */

public class CalculaQuadradoCubo {
    public static void main(String[] args) {
        int n1, n2;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        n1 = tec.nextInt();
        System.out.println("Informe o segundo número");
        n2 = tec.nextInt();
        System.out.printf("%nO quadrado de %d, maior número, é %.0f%n", Math.max(n1, n2), Math.pow(Math.max(n1, n2), 2));
        System.out.printf("O cubo de %d, menor número, é %.0f%n", Math.min(n1, n2), Math.pow(Math.min(n1, n2), 3));

    }
}
