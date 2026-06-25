package aula06Desafio;

import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Livro> listaLivros;

    public Biblioteca(String nome) {

        this.nome = nome;
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {

        listaLivros.add(livro);

        System.out.println(
                livro.getTitulo()
                + " adicionado.");
    }

    public void removerLivro(String isbn) {

        for(Livro livro : listaLivros) {

            if(livro.getIsbn().equals(isbn)) {

                listaLivros.remove(livro);

                System.out.println(
                        "Livro removido.");
                return;
            }
        }

        System.out.println(
                "Livro não encontrado.");
    }

    public void buscarLivro(String titulo) {

        for(Livro livro : listaLivros) {

            if(livro.getTitulo()
                    .equalsIgnoreCase(titulo)) {

                livro.exibirDetalhes();
                return;
            }
        }

        System.out.println(
                "Livro não encontrado.");
    }

    public void listarTodosLivros() {

        System.out.println("\n===== "
                + nome + " =====");

        for(Livro livro : listaLivros) {

            livro.exibirDetalhes();
        }
    }
}
