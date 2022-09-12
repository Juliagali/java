package turma58;
import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	

	/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
	
	float [] [] matriz = new float [3] [3];
	float maiores=0;
	
	for (int x = 0; x < 3; x++) {
		for (int y = 0; y < 3; y++) {
			
			System.out.println("Entre com um número para a linha " + x + " e um número para a coluna " + y);
			matriz [x] [y] = leia.nextFloat();
			
			if (matriz [x] [y] > 10) {
				maiores++;
			}
		}
	}
	
	System.out.println("\n\nA quantidade de números maiores que 10 é: " + maiores);
	
	
	

	}

}
