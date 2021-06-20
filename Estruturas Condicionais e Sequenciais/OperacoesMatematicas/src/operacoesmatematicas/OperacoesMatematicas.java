/*
 * Faça um programa que solicite ao usuário que informe dois números e
 * que exiba o seguinte menu:
 * 1- Somar
 * 2- Subtrair
 * 3- Multiplicar
 * 4- Dividir
 * 5- Sair
 * Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção
 */
package operacoesmatematicas;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int n1, n2;
        
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        int op;
        System.out.println("Digite um número para alguma das operações a seguir:");
        System.out.println ("1- Somar");
        System.out.println ("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Sair ");  
        op= entrada.nextInt();
        
        if (op ==1){
        System.out.println("A soma é: " + (n1+n2));
        } if (op ==2){
        System.out.println("A subtração é: " + (n1-n2));
        } if (op ==3){
        System.out.println("A multiplicação é: " + (n1*n2));
        } if (op ==4){
        System.out.println("A divisão é: " + (n1/n2));
        } if (op ==5){
        System.out.println("Fechando o programa ...");
        System.exit(0);
        }
    }   
}
