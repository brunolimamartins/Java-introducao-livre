package aula07e08veiculos;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("Carro se deslocando em quatro rodas.");
    }
}