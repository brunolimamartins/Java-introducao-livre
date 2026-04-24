package aula03.praticas;
import java.util.Scanner;

public class senha {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		//Estrutura com While
		while(senha != 1234) {
			System.out.print("Senha incorreta, digite novamente: ");
			senha = sc.nextInt();
			
		}
		System.out.print("Login realizado com sucesso");
		
		
	}

}
