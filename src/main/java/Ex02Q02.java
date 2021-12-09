import java.util.Scanner;
/*
Este programa retorna as tabuadas de um número informado (entre 1-10).
 */
public class Ex02Q02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe um número entre 1-10, que deseja conhecer sua tabuada:");
        int n1 = tec.nextInt();
         while(n1>10 ^ n1<1){
             System.out.println("Numero invalido. Escolha um número entre 1-10:");
             n1 = tec.nextInt();
         }

        System.out.println("\n" + "Tabuada de "+ n1);

        // Soma //

        System.out.println("\n" + "S O M A"+"\n");
        for (int i=1;i<=10;i++){
            int resultado = n1 + i;
            System.out.println(n1 + " + " + i + " = " + resultado);

        }
        // Subtração //

        System.out.println("\n" + "S U B T R A Ç Ã O"+"\n");
        for (int i=1;i<=10;i++){
            int resultado = n1 - i;
            System.out.println(n1 + " - " + i + " = " + resultado);
        }
        // Multiplicação //

        System.out.println("\n" + "M U L T I P L I C A Ç Ã O"+"\n");
        for (int i=1;i<=10;i++){
            int resultado = n1 * i;
            System.out.println(n1 + " * " + i + " = " + resultado);
        }
        // Divisão //

        System.out.println("\n" + "D I V I S Ã O"+"\n");
        for (float i=1;i<=10;i++){
            float resultado = n1 / i;
            System.out.printf("%d / %.0f = %.1f%n", n1, i, resultado );
        }
    }
}
