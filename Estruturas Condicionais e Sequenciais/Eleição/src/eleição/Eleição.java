/*
 * Considerando uma eleição de apenas dois candidatos, faça um
 * programa que leia o número total de eleitores, o número de votos do
 * primeiro candidato e o número de votos do segundo candidato. E em
 * seguida, o programa deverá apresentar o percentual de votos de cada
 * um dos candidatos e o percentual de votos nulos.
 */
package eleição;
import java.util.Scanner;

public class Eleição {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner (System.in);
        
        int te, v1, v2;
        System.out.println("Digite o número total de eleitores: ");
        te= entrada.nextInt();
        
        System.out.println("Digite o número de votos do primeiro candidato:");
        v1 = entrada.nextInt();
        
        System.out.println("Digite o número de votos do segundo candidato:");
        v2 = entrada.nextInt();
        
        int percv1 = (te/100)*v1 ;
        int percv2 = (te/100)*v2;
        int percnulo = (te/100)*(te-(v1+v2));
        
        System.out.println();
        System.out.println("O percentual de votos do primeiro candidato foi: "+percv1+"%" );
        System.out.println("O percentual de votos do segundo candidato foi: "+percv2+"%");
        System.out.println("O percentual de votos nulos foi: "+percnulo+"%");
    }
}
