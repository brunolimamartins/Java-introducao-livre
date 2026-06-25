package aula07e08desafio;

public class Funcionario extends Pessoa {

    private String matricula;
    private String departamento;

    public Funcionario(String nome, int idade,
                       String matricula,
                       String departamento) {

        super(nome, idade);

        this.matricula = matricula;
        this.departamento = departamento;
    }

    @Override
    public void saudacao() {
        System.out.println("Olá! Sou o funcionário " + nome +
                " do departamento " + departamento +
                ". Matrícula: " + matricula);
    }
}
