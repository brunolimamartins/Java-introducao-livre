package aula06exercicios;

public class Livro {

    String titulo;
    String autor;
    boolean estaEmprestado;

    void emprestar() {

        if (!estaEmprestado) {
            estaEmprestado = true;
            System.out.println("Livro emprestado.");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    void devolver() {

        if (estaEmprestado) {
            estaEmprestado = false;
            System.out.println("Livro devolvido.");
        } else {
            System.out.println("Livro não estava emprestado.");
        }
    }
}