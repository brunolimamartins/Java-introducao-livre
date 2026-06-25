package aula06exercicios;

public class Pizza {

    String sabor;
    String tamanho;
    double preco;
    boolean bordasRecheadas;

    double calcularPreco() {

        if (bordasRecheadas) {
            return preco + 5.0;
        }

        return preco;
    }

    void exibirPedido() {

        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Borda recheada: " + bordasRecheadas);
        System.out.println("Preço final: R$ " + calcularPreco());
    }
}