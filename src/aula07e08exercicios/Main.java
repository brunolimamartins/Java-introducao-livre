package aula07e08exercicios;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos", 8000));
        funcionarios.add(new Desenvolvedor("Ana", 5000));
        funcionarios.add(new Funcionario("Pedro", 3000));

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}
