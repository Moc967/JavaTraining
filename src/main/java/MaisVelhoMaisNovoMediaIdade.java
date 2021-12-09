import java.util.Scanner;

/*
Este programa lê nome e idade de 5 pessoas e ao final informa quem é o mais novo,
o mais velho e a média de idade.
*/

public class MaisVelhoMaisNovoMediaIdade {

        public static void main(String[] args) {

            Scanner tec = new Scanner(System.in);
            int maxAge, minAge, inMaxAge=0, inMinAge=0, indexName=0, indexAge=0;
            int[] age = new int [5];
            double prepMedia=0, media;
            String [] name = new String [5];

            // Leitura dos dados(Nome e Idade)

            while ( indexName < 5 ) {
                System.out.printf("%nInforme nome individuo # %d%n",indexName+1);
                name[indexName] = tec.next();
                System.out.printf("Informe a idade do individuo # %d%n",indexName+1);
                age[indexAge] = tec.nextInt();


                prepMedia = prepMedia + age[indexAge];
                indexName++;
                indexAge++;
            }

            // Calculo da media

            media = prepMedia / age.length;

            // Identifica o de maior idade

            maxAge = age[0];
            for (indexAge=1; indexAge < age.length;indexAge++){
                if(age[indexAge]>maxAge){
                    maxAge = age[indexAge];
                    inMaxAge = indexAge;
                }
            }

            // Identifica o de menor idade

            minAge = age[0];
            for (indexAge=1; indexAge < age.length;indexAge++) {
                if (age[indexAge] < minAge) {
                    minAge = age[indexAge];
                    inMinAge = indexAge;
                }
            }

            System.out.printf("%n%s é a pessoa mais nova, com %d anos de idade",name[inMinAge],minAge);
            System.out.printf("%n%s é a pessoa mais velha, com %d anos de idade",name[inMaxAge],maxAge);
            System.out.printf("%nA media entre as idades de todos os individuos é %.2f anos %n",media);


    }

}
