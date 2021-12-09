import java.util.Scanner;

/*
Este programa analisa UF informada e retorna a naturalidade correspondente
 */

public class SiglaToOrigem {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a sigla do seu estado (UF)");
        String ufSigla = tec.next();

        ufSigla = ufSigla.toUpperCase();

        switch (ufSigla) {
            case "MG" -> System.out.printf("Mineiro%n");
            case "PE" -> System.out.printf("Pernambucano%n");
            case "RJ" -> System.out.printf("Carioca%n");
            case "RN" -> System.out.printf("Potiguar%n");
            case "SP" -> System.out.printf("Paulista%n");
            default -> System.out.printf("Outros Estados%n");
        }
    }
}
