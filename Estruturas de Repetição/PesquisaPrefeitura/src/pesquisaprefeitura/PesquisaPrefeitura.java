/*
 * A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes,
 * coletando dados sobre o salário e o número de filhos. A prefeitura deseja
 * saber:
 * a ) A média do salário da população;
 * b ) A média do número de filhos.
 * O final da leitura de dados dar-se-á com a entrada de salários negativos.
 */
package pesquisaprefeitura;
import java.util.Scanner;

public class PesquisaPrefeitura {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner (System.in);
    int filhos, qtdfilhos=0, contador=1;
    double salario=0, somasal=0;

    while (salario >=0){
    System.out.printf("\nDigite o salário do %dº cidadão, ou para encerrar digite um número negativo:\n", contador);
    salario= entrada.nextDouble();

    if (salario >=0){
        somasal= somasal+salario;
        System.out.printf("Digite a quantidade de filhos:\n");
        filhos= entrada.nextInt();
        qtdfilhos= qtdfilhos+filhos;
        contador= contador+1;
    } else{
        System.out.printf("\nFim da leitura!\nCalculando...\n");
        contador= contador-1;}
    }
    System.out.printf("\nA média do número de filhos é: %d\n",qtdfilhos/contador);
    System.out.printf("A média salarial é: R$ %.2f\n", somasal/contador);
    System.out.printf("Quantidade de pessoas que participaram da pesquisa: %d\n", contador);
    }   
}
