import java.util.Scanner;

/*
Este programa lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
 */

public class SeparaImparesDePares {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero, i_impar = 0,i_par=0, i = 0;
        int[] par = new int [5];
        int[] impar = new int [5];
        boolean par_bool=false, impar_bool=false;

        while ( i < 5 ){
            System.out.println("Informe um número");
            numero = tec.nextInt();
            i++;
            if( numero % 2 == 0) {
                par[i_par] = numero;
                par_bool=true;
                i_par++;
            }else{
                impar[i_impar] = numero;
                impar_bool=true;
                i_impar++;
            }
        }
        if(impar_bool){
            System.out.print("Os números ímpares são: ");
            for (int j = 0; j < i_impar; j++) {
                System.out.print(impar[j]+" ");
            }
            System.out.println();
        }else{
            System.out.println ("Não foram informados números ímpares");}
        if(par_bool){
            System.out.printf("%nOs números pares são: ");
            for (int k = 0; k < i_par; k++) {
            System.out.print(par[k] + " ");
            }
            System.out.println();
        }else{
            System.out.println ("Não foram informados números pares");}

    }
}
