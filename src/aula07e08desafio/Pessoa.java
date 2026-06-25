package aula07e08desafio;

public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void saudacao() {
        System.out.println("Olá, eu sou " + nome);
    }
}
