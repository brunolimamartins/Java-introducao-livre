package aula07e08veiculos;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("Moto acelerando em duas rodas.");
    }
}