package turma58;
import java.util.Scanner;
public class LaçoRepetição_For1 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
     /*Informar todos os números de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)*/
	
	int  num;
	
	for(num=1000; num<=1999;num++) {
		
		if(num % 11 == 5) {

			System.out.println(num);
	}
	}
	
	}
	
}
