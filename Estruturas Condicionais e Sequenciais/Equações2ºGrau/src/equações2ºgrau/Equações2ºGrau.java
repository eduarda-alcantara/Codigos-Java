/*
 * Faça um programa para resolver equações de segundo grau (ax^2+bx+c).
 * delta = b^2+4*a*c
 * Onde:
 * 1- delta <0  --> Não existe raiz real
 * 2- delta =0  --> Existe só 1 raiz real  
 * 3- delta >0  --> Existem 2 raízes reais 
 */

package equações2ºgrau;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Equações2ºGrau {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int a, b, c;
        
        System.out.println("Digite a: ");
        a = entrada.nextInt();
        
        System.out.println("Digite b: ");
        b = entrada.nextInt();       
        
        System.out.println("Digite c: ");
        c = entrada.nextInt();
        
        double delta = (b*b)- 4*a*c;
        double x = -b /(2*a);
        double x1= (-b + Math.sqrt(delta))/2*a;
        double x2= (-b - Math.sqrt(delta))/2*a;
        
        if (delta == 0)
        System.out.println("A equação possui uma única raiz real= " +x);
        
        else if (delta <0)
        System.out.println ("Não existe raiz real!");
        
        if (delta >0) {
        System.out.println("A equação possui duas raizes reais");
        System.out.println("Primeira raiz: " + x1);   
        System.out.println("Segunda raiz: " + x2);   
        }    
    }
}
