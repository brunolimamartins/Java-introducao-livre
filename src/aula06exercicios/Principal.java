package aula06exercicios;

public class Principal {

    public static void main(String[] args) {

        System.out.println("===== EXERCÍCIO 1.1 =====");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Bruno";
        pessoa1.idade = 16;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Carlos";
        pessoa2.idade = 20;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);

        System.out.println("\n===== EXERCÍCIO 1.2 =====");

        Carro meuCarro = new Carro();

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2023;

        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);

        System.out.println("\n===== EXERCÍCIO 1.3 =====");

        Produto item = new Produto();

        item.nome = "Notebook";
        item.preco = 3500.00;
        item.quantidadeEmEstoque = 15;

        System.out.println("Nome: " + item.nome);
        System.out.println("Preço: R$" + item.preco);
        System.out.println("Estoque: " + item.quantidadeEmEstoque);

        System.out.println("\n===== EXERCÍCIO 2.1 =====");

        Cachorro meuCachorro = new Cachorro();

        meuCachorro.nome = "Rex";
        meuCachorro.raca = "Pastor Alemão";

        meuCachorro.latir();
        meuCachorro.comer();

        System.out.println("\n===== EXERCÍCIO 2.2 =====");

        Semaforo s = new Semaforo();

        s.mudarParaVerde();
        s.mudarParaAmarelo();
        s.mudarParaVermelho();

        System.out.println("\n===== EXERCÍCIO 2.3 =====");

        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));

        System.out.println("\n===== EXERCÍCIO 3.1 =====");

        Livro livro = new Livro();

        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";

        livro.emprestar();
        livro.emprestar();

        livro.devolver();
        livro.devolver();

        System.out.println("\n===== EXERCÍCIO 3.2 =====");

        Termostato t = new Termostato();

        t.temperaturaAtual = 22;

        t.exibirStatus();

        t.aumentarTemperatura(5);
        t.exibirStatus();

        t.diminuirTemperatura(10);
        t.exibirStatus();

        System.out.println("\n===== EXERCÍCIO 3.3 =====");

        Pizza pizza1 = new Pizza();

        pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        pizza1.preco = 40;
        pizza1.bordasRecheadas = true;

        Pizza pizza2 = new Pizza();

        pizza2.sabor = "Frango";
        pizza2.tamanho = "Média";
        pizza2.preco = 30;
        pizza2.bordasRecheadas = false;

        pizza1.exibirPedido();

        System.out.println();

        pizza2.exibirPedido();

        System.out.println("\n===== EXERCÍCIO 4.1 =====");

        ContaBancaria conta =
                new ContaBancaria("12345-6", 1000);

        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.depositar(-50);
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.sacar(2000);
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.depositar(500);
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.sacar(300);
        System.out.println("Saldo: R$" + conta.getSaldo());

        System.out.println("\n===== EXERCÍCIO 4.2 =====");

        Estudante aluno =
                new Estudante("Bruno", 16);

        System.out.println("Idade: " + aluno.getIdade());

        aluno.setIdade(-5);
        System.out.println("Idade: " + aluno.getIdade());

        aluno.setIdade(150);
        System.out.println("Idade: " + aluno.getIdade());

        aluno.setIdade(17);
        System.out.println("Idade: " + aluno.getIdade());

        System.out.println("\n===== FIM DOS EXERCÍCIOS =====");
    }

         
         
            
        
    }
