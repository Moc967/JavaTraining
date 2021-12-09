import java.util.Scanner;

/*
Este programa lê 5 números, informa o maior, o menor e a média entre eles
 */

public class MaxMinMedianOfNumbers {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int maxValue, minValue, index=0;
        int[] number = new int [5];
        double prepMedia=0, media;

        // Leitura dos números

        while ( index < 5 ) {
            System.out.println("Informe um número");
            number[index] = tec.nextInt();
            prepMedia = prepMedia + number[index];
            index++;
        }

        // Calculo da media

        media = prepMedia / number.length;

        // Identifica o maior número

        maxValue = number[0];
        for (index=1; index < number.length;index++){
            if(number[index]>maxValue){
                maxValue = number[index];
            }
        }

        // Identifica o menor número

        minValue = number[0];
        for (index=1; index < number.length;index++) {
            if (number[index] < minValue) {
                minValue = number[index];
            }
        }

        System.out.printf("%nA media entre os números informados é %.2f",media);
        System.out.printf("%nO maior número é %d",maxValue);
        System.out.printf("%nO menor número é %d",minValue);

    }
}
