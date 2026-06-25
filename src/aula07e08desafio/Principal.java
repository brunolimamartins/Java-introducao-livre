package aula07e08desafio;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Cliente("Bruno", 16, 1001));
        lista.add(new Funcionario("Carlos", 35,
                "F001", "TI"));
        lista.add(new Cliente("Maria", 28, 1002));

        for (Pessoa p : lista) {
            p.saudacao();
        }
    }
}