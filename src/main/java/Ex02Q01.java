import java.util.Scanner;

/*
Este programa calcula recebe dois números inteiros e informa o resultado das operações
soma, subtração, multiplicação e divisão, sempre na ordem em que foram informados.
 */

public class Ex02Q01 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int n1 = tec.nextInt();
        System.out.println("Informe o segundo número, diferente de zero:");
        int n2 = tec.nextInt();
        while (n2 == 0){
            System.out.println("O segundo número deve ser diferente de zero.");
            System.out.println("Informe mais uma vez o segundo numero: ");
            n2 = tec.nextInt();
        }
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        System.out.println("Sum: " + n1 + " + " + n2 + " = " + soma);
        System.out.println("Sub: " + n1 + " - " + n2 + " = " + subtracao);
        System.out.println("Mul: " + n1 + " * " + n2 + " = " + multiplicacao);
        System.out.println("Div: " + n1 + " / " + n2 + " = " + divisao);
    }
}
