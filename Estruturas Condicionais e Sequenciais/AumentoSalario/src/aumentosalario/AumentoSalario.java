/*
 * Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. 
 * Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado 
 * ou uma mensagem, caso o funcionário não tenha direito ao aumento.
 */

package aumentosalario;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salario;
        System.out.println("Digite salário: ");
        salario = entrada.nextDouble();
         
        double aumento = salario +(0.3*salario);
        if (salario<1000){
           System.out.printf("\nO funcionário tem direito ao aumento.\n");
           System.out.printf("Novo salário= %.2f\n" ,aumento);
        }else 
            System.out.printf("\nO funcionário não tem direito ao aumento.\n");
    }
}
