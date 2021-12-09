
/*
Este  programa lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém
está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
 */

import java.util.Scanner;

public class CalculaMassaCorporal {
    public static void main(String[] args) {
        double imc, height, weight;
        int inImc=0, indexName=0;
        int[] imcOut = new int [5];

        String [] name = new String [5];

        Scanner tec = new Scanner(System.in);

        // Leitura dos dados(nome, altura e peso)

        while ( indexName < 5 ) {
            System.out.printf("%nInforme nome individuo # %d%n",indexName+1);
            name[indexName] = tec.next();
            System.out.printf("Informe a altura em metros do individuo # %d%n",indexName+1);
            height = tec.nextDouble();
            System.out.printf("Informe o peso em kg do individuo # %d%n",indexName+1);
            weight = tec.nextDouble();

            imc = 0;
            imc = weight/Math.pow(height, 2);

            System.out.printf("imc de %s = %.1f%n",name[indexName], imc );

            if (imc<18.5 || imc >25){
            imcOut[inImc] = indexName+1;
            inImc++;
            }
            indexName++;
            weight=0;
            height=0;
        }

        if (imcOut[0]==0){
            System.out.println("Todos estão de parabéns por estarem dentro do IMC recomendável!!");
        }else{
            System.out.printf("%nAs seguintes pessoas estão fora do peso ideal: %n");
            for (inImc=0;inImc < 5; inImc++) {
                if (imcOut[inImc]!=0){
                    System.out.println(name[imcOut[inImc]-1]);
                }

            }
        }
    }

}
