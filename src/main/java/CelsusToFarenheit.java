import java.util.Scanner;

/*
Este programa converte temperaturas de Celsius para Farenheit
 */

public class CelsusToFarenheit {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius");
        float celsius = tec.nextFloat();
        float farenheit = ( (celsius * 9)/5) + 32;
        System.out.printf("%n%.0f graus Celsius equivalem a %.1f graus Farenheit %n", celsius, farenheit );
    }
}
