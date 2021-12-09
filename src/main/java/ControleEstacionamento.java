import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class ControleEstacionamento {
    public static void main(String[] args) {
        int placaf=0, horaIn=1, horaOut=2, hotaEst=3;

        String [][] est = new String [10][4];
        String locstr;
        int[] contVagas = new int[10];

        String placa, quit=null;
        Scanner tec = new Scanner(System.in);

        while (!Objects.equals(quit, "quit")){
            System.out.println("Informe a placa do veiculo ou quit para sair");
            placa = tec.next();
            if (Objects.equals(placa, "quit")){
                quit = placa;
            }

            //Verificar se placa esta aberta

            for(int i=0;i<est.length;i++){

                if(est[i][placaf]==placa){
                  if(Integer.parseInt(est[i][horaOut])!=0){
                      est[i][placaf]=placa;
                      System.out.printf("%nEntrada do veiculo de placa %s%n", placa);
                      est[i][horaIn]= LocalDateTime.now().toString();
                      System.out.println("Imprimir Relatorios"); //Imprimir Relatório

                  }
                }else{
                    for(i=0;i<est.length;i++){
                        if(Integer.parseInt(est[i][placaf])==0){
                            est[i][placaf]=placa;
                            System.out.printf("%nEntrada do veiculo de placa %s%n", placa);
                            est[i][horaIn]= LocalDateTime.now().toString();
                            System.out.println("Imprimir Relatorio"); //Imprimir Relatório
                        }else{
                            if(Integer.parseInt(est[i][horaOut])!=0) {
                                est[i][placaf] = placa;
                                System.out.printf("%nEntrada do veiculo de placa %s%n", placa);
                                est[i][horaIn] = LocalDateTime.now().toString();
                                est[i][horaOut] = String.valueOf(0);
                                System.out.println("Imprimir Relatorio"); //Imprimir Relatório
                            }

                        }
                    }
                }
            }

        }
    }
}