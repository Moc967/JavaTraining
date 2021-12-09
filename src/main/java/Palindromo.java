import java.util.Scanner;

/*
Este programa lê uma palavra e a escreve de volta ao contrário.
 */

public class Palindromo {
    public static void main(String[] args) {
        String palavra;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe uma palavra");
        palavra = tec.next();
        char[] reverse = palavra.toCharArray();

        System.out.print("O palindromo de "+ palavra + " é : ");
        for (int i = reverse.length -1; i>=0; i--)
            System.out.print(reverse[i]);
    }
}
