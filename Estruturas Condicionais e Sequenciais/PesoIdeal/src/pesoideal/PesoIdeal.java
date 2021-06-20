/*
 * Faça um programa que leia o sexo e a altura (H - em metros) de
 * uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes
 * fórmulas:
 * Peso ideal (homens) = (72,7 * H)– 58
 * Peso ideal (mulheres) = (62,1 * H)– 44,7
 * Sugestão: para identificar o sexo da pessoa, solicite ao usuário que
 * informe 1 para homens, e 2 para mulheres
 */

package pesoideal;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        int sexo;
        double h;      
        
        System.out.println("Digite o seu sexo,sendo:");
        System.out.println("1- Masculino");
        System.out.println("2- Feminino");
        sexo= entrada.nextInt();
        
        System.out.println("Digite sua altura em metros:");
        h = entrada.nextDouble();
        
        double peso1 =(72.7*h)-58;  // peso masculino
        double peso2= (62.1*h)- 44.7;  // peso feminino
                
        if (sexo ==1) {
        System.out.println("--------------------------------");
        System.out.println("Seu peso ideal é: " +peso1+ " Kg");
        } else{
        System.out.println("--------------------------------");    
        System.out.println("Seu peso ideal é: " +peso2+ " Kg"); 
    }    
  }
}
