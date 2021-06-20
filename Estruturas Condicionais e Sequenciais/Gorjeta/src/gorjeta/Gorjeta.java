/*
 * Todo restaurante, embora por lei não possa obrigar o cliente a pagar,
 * cobra 10% para o garçom. Faça um programa que leia o valor gasto
 * pelo cliente e informe o valor a ser pago de gorjeta
 */
package gorjeta;
import java.util.Scanner;

public class Gorjeta {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
         
        double conta;
        System.out.println("Digite o valor da conta: ");
        conta = entrada.nextDouble();
        
        double gorj = 0.1*conta;
        System.out.println("O valor de gorjeta é: " +gorj);
    }
}
