package aula07e08veiculos;

public class Veiculo {

    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}