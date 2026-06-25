package aula06exercicios;

public class Termostato {

    double temperaturaAtual;

    void aumentarTemperatura(double valor) {
        temperaturaAtual += valor;
        System.out.println("Nova temperatura: " + temperaturaAtual + "°C");
    }

    void diminuirTemperatura(double valor) {
        temperaturaAtual -= valor;
        System.out.println("Nova temperatura: " + temperaturaAtual + "°C");
    }

    void exibirStatus() {

        if (temperaturaAtual < 20) {
            System.out.println("Frio");
        } else if (temperaturaAtual <= 25) {
            System.out.println("Confortável");
        } else {
            System.out.println("Quente");
        }
    }
}