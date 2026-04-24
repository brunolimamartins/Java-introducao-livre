package aula05praticas;

public class calculadora {
	
	public static int somar(int x, int y ) {
		return x + y;
	}

	public static void main(String[] args) {
		
		
		System.out.println("Resultado da soma:"+somar(99,658));
		
		System.out.println("Resultado da subtração:"+subtrair(101,100));	
		
		System.out.println("Resultado da multiplicação:"+multiplicacao(15,15));
		System.out.println("Resultado das multiplicações:"+multiplicacao(15,15)*2);
		
		//dividindo dois números
		System.out.println("Resultado da divizão:"+dividir(48,4));
		
		
	}
	public static int multiplicacao(int x, int y) {
		return x * y;
		
	}
	public static int subtrair(int x, int y) {
		return x - y;
	}
	public static double dividir(double x, double y) {
		if(y == 0) {
		System.out.println("O denominador não pode ser zero");
			
		}
		
		return x / y;
	}

}
