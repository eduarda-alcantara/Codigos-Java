/*
 * Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre quantas
 * pessoas do sexo masculino possuem peso entre 60 e 80 kg, bem como a
 * quantidade de mulheres que possuem peso entre 50 e 70 kg.
 */
package pesogenero;
import java.util.Scanner;

public class PesoGenero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int sexo;
        double peso=0;
        int indicadormasc=0;
        int indicadorfem=0;
        int contador=1;

        while (contador <=10){
            System.out.printf("\nDigite seu sexo,sendo:\n1= Masculino\n2=Feminino\n");
            sexo= entrada.nextInt();
            contador++;
            if (sexo==1){
                System.out.println("Digite seu peso(em kg): ");
                peso= entrada.nextDouble();
            } if((peso>=60) &&(peso <=80)){
                indicadormasc++;
                System.out.printf("\nA quantidade de homens com peso entre 60 e 80 kg é %d\n",indicadormasc );
            } else if (sexo ==2){
                System.out.println("Digite seu peso(em kg): ");
                peso= entrada.nextDouble();
            } if((peso>=50) &&(peso <=70)){
                indicadorfem++;
                System.out.printf("\nA quantidade de mulheres com peso entre 50 e 70 kg é %d\n",indicadorfem );
            }
        }
        System.out.println("Fim do programa!");
    }
}
