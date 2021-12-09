import java.util.Scanner;

public class TestePalindromo {
    public static void main(String[] args) {

        System.out.print("Digite uma palavra para ve-la ao contrário: ");
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next();
        char[] palavraInvertida = new char[palavra.length()];
        int tamanhoPalavra = palavra.length() - 1;


        //<Instrução I>
        for ( int i = tamanhoPalavra; i >= 0; i-- )
            palavraInvertida[tamanhoPalavra-i] = palavra.charAt(i);

        String palavraInvertidaStr = new String(palavraInvertida);
        if(palavraInvertidaStr.equals(palavra)){
            System.out.printf("A palavra %s é um palíndromo",palavraInvertidaStr);
        }else{
            System.out.printf("A palavra %s não é um palíndromo",palavraInvertidaStr);
        }

    }
}
