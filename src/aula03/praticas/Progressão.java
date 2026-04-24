package aula03.praticas;

public class Progressão {
	public static void main(String[]args) {
		int contador = 1;
		int contador2 = 1;
		
		//Estrutura While.
		
		while(contador<=10) {
			System.out.print(contador + ",");
			contador ++;
		}
		//Estrutura DO WHILE
		do {
			System.out.println(contador2 + ",");
			contador2 ++;
		} while (contador2<=10);
	}

}
