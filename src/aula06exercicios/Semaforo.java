package aula06exercicios;

public class Semaforo {

    String corAtual;

    void mudarParaVerde() {
        corAtual = "Verde";
        System.out.println("Semáforo: " + corAtual);
    }

    void mudarParaAmarelo() {
        corAtual = "Amarelo";
        System.out.println("Semáforo: " + corAtual);
    }

    void mudarParaVermelho() {
        corAtual = "Vermelho";
        System.out.println("Semáforo: " + corAtual);
    }
}
