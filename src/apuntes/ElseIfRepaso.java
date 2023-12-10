package apuntes;
import java.util.Scanner;
public class ElseIfRepaso {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int age;
		System.out.println("Cual es su edad");
		age = read.nextInt();
		//System.out.println("La edad es "+ age);
		if (age >= 0 && age <= 11) {
			System.out.println("Ssos niño");
		} else if (age >= 12 && age <= 15) {
			System.out.println("Sos preadolecente");
		}else if(age > 15 && age <= 18) {
			System.out.println("Sos Adolecente");
		}else if(age >= 19 && age <= 25) {
			System.out.println("Sos joven");
		}else if(age >= 26 && age <= 60) {
			System.out.println("Sos adulto");
		}else if(age > 60) {
			System.out.println("Adulto mayor");
		}
		
	}
}
