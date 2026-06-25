package aula06Desafio;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo,
                 String autor,
                 String isbn,
                 boolean disponivel) {

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void emprestarLivro() {

        if(disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado.");
        }
        else {
            System.out.println("Livro já emprestado.");
        }
    }

    public void devolverLivro() {

        if(!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido.");
        }
        else {
            System.out.println("Livro não estava emprestado.");
        }
    }

    public void exibirDetalhes() {

        System.out.println("-------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: "
                + (disponivel ? "Sim" : "Não"));
    }
}