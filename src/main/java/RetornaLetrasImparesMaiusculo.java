import java.util.Scanner;

/*
Este programa lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
 */

public class RetornaLetrasImparesMaiusculo {
    public static void main(String[] args) {

        int index = 0;
        String word_In;

        Scanner tec = new Scanner(System.in);
        System.out.println("Informe uma palavra");
        word_In = tec.next();
        char [] word_Temp = word_In.toCharArray();

        char[] word_Out = new char[word_Temp.length];

        while ( index < word_Temp.length) {
            if ( index % 2 ==0){
                word_Out[index]= Character.toUpperCase(word_Temp[index]);
            }else{
                word_Out[index]= Character.toLowerCase(word_Temp[index]);
            }
            index++;

        }
        System.out.println(word_Out);
    }
}
