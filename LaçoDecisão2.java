package turma58;
import java.util.Scanner;
public class LaçoDecisão2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0, b=0, c=0;
		
		System.out.println("\nEntre com o A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o C: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("Ordem crescente: " + a  + "," + b + " e " + c);
		} else if(a<=c && c<=b) {
			System.out.println("Ordem crescente: " + a  + "," + c + " e " + b);
		} else if(b<=a && a<=c) {
			System.out.println("Ordem crescente: " + b + "," + a + " e " + c);
		} else if(b<=c && c<=a) {
			System.out.println("Ordem crescente: " + b + "," + c + " e " + a);
		} else if(c<=a && a<=b) {
			System.out.println("Ordem crescente: " + c + "," + a + " e " + b);
		} else  {
			System.out.println("Ordem crescente: " + c + "," + b + " e " + a);	
		}	
	}

}
