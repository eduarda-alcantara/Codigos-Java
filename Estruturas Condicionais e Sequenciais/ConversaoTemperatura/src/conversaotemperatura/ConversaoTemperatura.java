/*
 * Faça um programa que receba uma temperatura em Celsius, calcule e
 * mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)
 */
package conversaotemperatura;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);       
        double c;
        System.out.println ("Escreva a temperatura em Celsius:");
        c = entrada.nextDouble();
        
        double f=(c * 1.8) + 32;
        System.out.println("Essa temperatura convertida em Fahrenheit é:  "+f+" ºF");
    }   
}
