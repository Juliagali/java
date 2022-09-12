package turma58;
import java.util.Scanner;
public class Arrays2 {

		public static void main(String[] args){	
			
		Scanner leia = new Scanner(System.in);	
		
	/* 2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.*/
		
		
		float [] vetor = new float[6];
		float [] pares = new float[6];
		float [] impares = new float [6];
		float  somaImp=0, somaPar=0, qtdImp=0;
		
		for (int i = 0; i < 6.; i++) {
			System.out.println("Insira um número inteiro: ");
			vetor[i] = leia.nextFloat();
			
		 		if (vetor[i] % 2 != 0) {
		 			somaPar = somaPar + vetor[i];
		 			pares[i] = vetor[i];
		 			
		 		}else { 
		 			qtdImp++;
		 			somaImp = somaImp + vetor[i];
		 			impares[i] = vetor[i]; 
			}
		 		
		}
		
		System.out.println("\nnúmeros ímpares inseridos: ");
		for (int f = 0; f < 6; f++) {
			if(pares[f] != 0) {
				System.out.println(pares[f]);
			}
		}
		
		System.out.println("\nnúmeros pares inseridos: ");
		for (int g = 0; g < 6; g++) {
			if(impares[g] != 0) {
				System.out.println(impares[g]);
			}
		}
		
		System.out.println("\nA soma dos números ímpares digitados é: " + somaPar);
		System.out.println("A quantidade de números pares digitados é: " + somaImp);
		
		}
		
}

