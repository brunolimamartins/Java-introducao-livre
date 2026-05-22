package aula06praticas;

import aula06praticas.pessoa;
import aula06praticas.carro;

public class Principal {
	public static void main(String[] args) {

        // Instância da classe Pessoa

        System.out.println("Utilizando a classe Pessoa");

        pessoa p1 = new pessoa(); // 1ª pessoa
        p1.nome = "Ana";
        p1.idade = 20;

        pessoa p2 = new pessoa();
        p2.nome = "Carlos";
        p2.idade = 50;

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);

        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        
        System.out.println("Utilizando a classe carro");
        
        
        System.out.println("Marca:" + meucarro.marca);
        System.out.println("Marca:" + meucarro.modelo);
        System.out.println("Marca:" + meucarro.ano);
        
        
        // Instancia da classe cachorro
        System.out.println("utilizando a classe cachorro");
        Cachorro meuCachorro = new Cachorro();
        
        meuCachorro.nome = "Thor";
        meuCachorro.raça = "Pintcher";
        meuCachorro.latir();
        meuCachorro.comer();
        
        
        
       
        
	

}
}
