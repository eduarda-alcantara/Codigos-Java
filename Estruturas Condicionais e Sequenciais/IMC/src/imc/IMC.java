/*
 * Construa um programa para determinar se o indivíduo está com um peso
 * favorável. Essa situação é determinada através do IMC (Índice de
 * Massa Corpórea), que é definida como sendo a relação entre o peso
 * (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo.
 * Ou seja, IMC= PESO/ALTURA2 e, a situação do peso é determinada pelas 
 * informações abaixo:
 * IMC <20 = Abaixo do peso
 * IMC <=25 = Peso normal
 * IMC <=30 = Sobrepeso
 * IMC <=40 = Obeso
 * IMC >40 = Obeso mórbido
 */

package imc;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);        
        double peso, altura;
        
        System.out.println("Digite seu peso em kg: ");
        peso= entrada.nextDouble();
        
        System.out.println("Digite sua altura em metros: ");
        altura= entrada.nextDouble();
        
        double imc= peso/(altura*altura);      
        System.out.printf("\nIMC = %.2f\n",imc);
         
        if (imc< 20){
            System.out.println("Abaixo do peso");        
        }else if (imc <=25) {
          System.out.println("Peso normal");     
        }else if(imc <=30){
          System.out.println("Sobrepeso");       
        }else if (imc <=40){
           System.out.println("Obeso");              
        }else
           System.out.println("Obeso mórbido");
    }  
}
