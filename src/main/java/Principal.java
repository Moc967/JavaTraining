import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero =  scanner.nextInt();

        if(numero % 2==0){
            System.out.println("Número par");
        }else{
            System.out.println("Número impar");
        }
    }
}
