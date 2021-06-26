/*
 * Durante os 6 primeiros meses do ano, foram realizadas, mensalmente, pesquisas
 * com uma determinada população a respeito da preferência de votos para os 4 
 * candidatos a prefeito da cidade. Faça um programa que leia e armazene a 
 * quantidade de votos coletada para cada candidato, mensalmente, e mostre: 
 * - a maior quantidade de votos registrada, o mês e o candidato que obteve a 
 * maior quantidade
 * - a menor quantidade de votos registrada, o mês e o candidato que obteve a 
 * menor quantidade
 */
package pesquisascandidatos;
import java.util.Scanner;

public class PesquisasCandidatos {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
	int matriz[][] = new int[6][4];          //6 meses e 4 candidatos
	int maiorVoto = -9999, mesMaior = 0, candidatoMaior = 0;
	int menorVoto = 99999, mesMenor = 0, candidatoMenor = 0;
		
	for(int i = 0; i < matriz.length; i++) {
	    System.out.println();
	    System.out.println("Mês: "+(i+1));
	    System.out.println("Quantidade de votos:");
	    System.out.println();
	    for(int j = 0; j < matriz[i].length; j++) {
	        System.out.printf("CANDIDATO %d: ",(j+1));
	        matriz[i][j] = entrada.nextInt();
		}
	}
	for(int i = 0; i < matriz.length; i++) {
		for(int j = 0; j < matriz[i].length; j++) {
		    if(matriz[i][j] > maiorVoto) {
			candidatoMaior = j;
			mesMaior = i;
			maiorVoto = matriz[i][j];
		    } else if(matriz[i][j] < menorVoto) {
			candidatoMenor = j;
			mesMenor = i;
			menorVoto = matriz[i][j];
		    }
		}
	}
	System.out.printf("\nMaior quantidade de votos: %d | Mês: %d | Candidato: %d", maiorVoto, (mesMaior+1), (candidatoMaior+1));
	System.out.printf("\nMenor quantidade de votos: %d | Mês: %d | Candidato: %d\n", menorVoto, (mesMenor+1), (candidatoMenor+1));
    }    
}
