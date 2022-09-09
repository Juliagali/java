package turma58;
import java.util.Scanner;
public class LaçoRepetição_While3 {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
	
		int idade=0, menos21=0, mais50=0;
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
			
			if (idade<21) {
				menos21++;
			}if (idade>50) {
				mais50++;
			}		
		}
		
		System.out.println("\nA quantidade de pessoas com menos de 21 anos de idade é de: " + menos21);
		System.out.println("A quantidade de pessoas com mais de 50 anos de idade é de: " + mais50);
		
		
	}

}