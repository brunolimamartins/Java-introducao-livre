package aula02.exercicios;
import java.util.Scanner; //Scanner da biblioteca
public class Par_ou_impar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número:");
		int numero =sc.nextInt();
		
		if (numero%2==0) {
			System.out.print("O número é par!");
		
	}
		else {
			System.out.print("O número é impar!");
		}
		
	}

}
