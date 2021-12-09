import java.util.Scanner;

/*
Este programa lê o nome de 5 pessoas, armazena numa lista de convidados e o final,
informe qual o nome mais longo presente na lista.
 */

public class GuestList {
    public static void main(String[] args) {

        int index = 0, maxValue;

        String maiorNome;
        String [] guestNames = new String[5];
        Scanner tec = new Scanner(System.in);

        while ( index < 5 ) {
            System.out.println("Informe o nome do convidado");
            guestNames[index] = tec.next();
            index++;
        }

        maxValue =  guestNames[0].length();
        maiorNome = guestNames[0];
        for (index=1; index < guestNames.length;index++) {
            if (guestNames[index].length() > maxValue) {
                maxValue = guestNames[index].length();
                maiorNome = guestNames[index];
            }
        }
        System.out.println("O convidado de nome mais longo é " + maiorNome);
    }
}