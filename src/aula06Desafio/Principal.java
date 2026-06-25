package aula06Desafio;

public class Principal {

    public static void main(String[] args) {

        Biblioteca biblioteca =
                new Biblioteca("Biblioteca Escolar");

        Livro livro1 =
                new Livro(
                        "O diario de um banana",
                        "Jeff Kinney",
                        "111",
                        true);

        Livro livro2 =
                new Livro(
                        "O Pequeno Príncipe",
                        "Antoine de Saint-Exupéry",
                        "222",
                        true);

        Livro livro3 =
                new Livro(
                        "Harry Potter",
                        "J. K. Rowling",
                        "333",
                        true);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        livro1.emprestarLivro();
        livro1.emprestarLivro();

        livro1.devolverLivro();

        biblioteca.removerLivro("222");

        biblioteca.buscarLivro("Harry Potter");

        biblioteca.listarTodosLivros();
    }
}