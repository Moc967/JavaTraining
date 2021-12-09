import java.util.Scanner;

public class VerificarDivisibilidade {
    public static void main(String[] args) {

        int number, i=0;
        boolean div10=false, div5=false, div2=false;
        Scanner tec = new Scanner(System.in);

        System.out.println("Informe um número");
        number = tec.nextInt();

        if(number%10==0){
            div10 = true;
        }
        if(number%5==0) {
            div5 = true;
        }
        if(number%2==0) {
            div2 = true;
        }
        if(!div10&&!div5&&!div2) {
            System.out.printf("%nO número %d não é divisivel nem 10,5 ou 2%n", number);
        }
        if(div10||div5||div2){
            System.out.println("O numero "+number+" é divisivel por:");
            if(div10) {
                System.out.println(10);
            }
            if(div5){
                System.out.println(5);
            }
            if(div2){
                System.out.println(2);
            }

        }
    }
}