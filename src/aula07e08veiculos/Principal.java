package aula07e08veiculos;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Toyota", "Corolla"));
        veiculos.add(new Moto("Honda", "CG 160"));

        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}