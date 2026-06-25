package aula02.exercicios;
import java.util.Scanner;
public class caixaeletronico {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		double saldo =500;
		
		System.out.println("_____Caixa ELETRONICO_______");
		System.out.print("Digite o valor do saque:");
		double valorSaque = sc .nextDouble();
		if (valorSaque%10!=0){
			System.out.println("Erro: O valor deve ser multiplo de 10");
		}
		  else if (valorSaque>saldo) {
			System.out.println("Erro: Saldo insuficiente!");
		}
		else {
			saldo = saldo-valorSaque;
			System.out.println("Saque reaslizado com sucesso!");
			System.out.println("Novo saldo:"+saldo);
		}
		sc.close();
	}

}
