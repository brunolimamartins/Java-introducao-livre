package aula07e08desafio;

public class Cliente extends Pessoa {

    private int codigoCliente;

    public Cliente(String nome, int idade, int codigoCliente) {
        super(nome, idade);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void saudacao() {
        System.out.println("Olá! Sou o cliente " + nome +
                " e meu código é " + codigoCliente);
    }
}