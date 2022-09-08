package turma58;

	import java.util.Scanner; 
	
public class Laços_decisão {
	
	public static void main(String[ ] args) {
		
	Scanner leia = new Scanner(System.in);
	
	//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	int maiorNum=0, num1=0, num2=0, num3=0;
	
	System.out.println("\nInsira um número inteiro: ");
	num1 = leia.nextInt();
	System.out.println("\nEntre com um número: ");
	num2 = leia.nextInt();
	System.out.println("\nEntre com um número: ");
	num3 = leia.nextInt();
	
	if((num1 >= num2) && (num1 >= num3)) {
		maiorNum = num1;
	} if((num2>=num1) && (num2>=num3)) {
		maiorNum = num2;
	} else  {
		maiorNum = num3;
	}
	
	System.out.println("\nO maior número é: " + maiorNum );
	
	
	}
	

}
