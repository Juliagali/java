package turma58;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		
		Scanner leia = new Scanner(System.in);
		
		float[ ] vetor = new float[6];
		float n1, n2, n3, n4, n5, n6, soma=0;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Entre com um número: ");
			vetor [i] = leia.nextFloat();
		}
		
System.out.println("\n\t\tValor de cada vetor:");
System.out.println("\nPosição 0: " + vetor[0]);
System.out.println("Posição 1: " + vetor[1]);
System.out.println("Posição 2: " + vetor[2]);
System.out.println("Posição 3: " + vetor[3]);
System.out.println("Posição 4: " + vetor[4]);
System.out.println("Posição 5: " + vetor[5]);

soma = vetor[0] + vetor[1] + vetor[5];
System.out.println("\nO resultado da soma das posições [0], [1] e [5] é: " + soma);
	}

}
