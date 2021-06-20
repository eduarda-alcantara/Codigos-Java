/*
 * Dados três valores X, Y, Z, verificar se eles podem ser 
 * os comprimentos dos lados de um triângulo. 
 * Se eles não formarem um triângulo escrever uma mensagem. 
 * Considerar que o comprimento de cada lado de um triângulo 
 * é menor que a soma dos outros dois lados.
 */

package ladostriangulo;

import java.util.Scanner;
import static java.lang.Math.abs;

public class LadosTriangulo {
    public static void main(String[] args) {
                      
        Scanner entrada = new Scanner (System.in);
        
        int x, y, z;
        System.out.println("Digite x: ");
        x= entrada.nextInt();
        
        System.out.println("Digite y: ");
        y= entrada.nextInt();
        
        System.out.println("Digite z: ");
        z= entrada.nextInt();
        
        //abs= modulo da operação
        if ((x> abs(y-z)) && (x< y+z)){
            System.out.printf("\nLado 'x' válido\n");
        
            if ((y> abs(x-z)) && (y< x+z))
            {
               System.out.println("Lado 'y' válido");
            }    
        
            if ((z> abs(x-y)) && (z< x+y)) 
            {
              System.out.println("Lado 'z' válido");        
            }
          System.out.print("Todos os lados são válidos, triângulo existente.\n\n");
        
        }else{  
          System.out.printf("\nUm ou mais lados não são válidos, triângulo não existente.\n");
          System.out.printf("!!! SAIBA QUE:\nPara um lado ser válido ele precisa "
                  + "ser maior que o módulo da diferença dos dois outros e "
                  + "menor que a soma dos dois outros lados. !!!\n\n");
        }  
    }
}
