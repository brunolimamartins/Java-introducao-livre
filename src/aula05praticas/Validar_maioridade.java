package aula05praticas;

public class Validar_maioridade {
	
public static boolean Maiordeidade(int idade) {
	return idade >=18;
				
}
   public static void main(String[] args) {
	   boolean maioridade = Maiordeidade(15);
	   if (maioridade){
		   System.out.println("Tá liberado XD");
		   
	   }
	   else {
		   System.out.println("Você é menor de idade, VAZAAAAAAAA");
	   }
   }
}
