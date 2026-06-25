package aula02.exercicios;
import java.util.Scanner;

public class LoginSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do usuario:");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua senha:");
		int senha = sc.nextInt();
		
		if ((nome.equals("admin") && (senha == 123 ))){
			System.out.print("Login foi realizado com sucesso.");
			
		}
		
		else {
			System.out.print("Usuario invalido.");
		}
		
		
		
	}
	
 
}
