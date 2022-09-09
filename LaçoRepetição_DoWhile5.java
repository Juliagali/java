package turma58;
import java.util.Scanner;
public class LaçoRepetição_DoWhile5 {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	/* 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
	
	int num, somaNum=0;

	
	do {
		System.out.println("Insira um número: ");
		num = leia.nextInt();
		somaNum = num + somaNum;
	}	while (num != 0) ;

	

	
		System.out.println("\nA soma dos números digitados é de: " + somaNum);

	
	
	
	
}
}