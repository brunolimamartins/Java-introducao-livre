package aula06praticas;

public class PraticaPOO {

    // Classe Aluno
    static class Aluno {
        String nome;
        int idade;

        void apresentar() {
            System.out.println("Olá, meu nome é " + nome);
        }
    }

    // Classe Conta
    static class Conta {
        String titular;
        private float saldo;

        void setSaldo(float saldo) {
            if (saldo > 0) {
                this.saldo = saldo;
            }
        }

        float getSaldo() {
            return saldo;
        }

        float depositar(float valor) {
            saldo += valor; // agora atualiza de verdade
            return saldo;
        }
    }

    public static void main(String[] args) {

        // Criando alunos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Bruno";
        aluno1.idade = 89;

        System.out.println(aluno1.nome);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Joana";
        aluno2.idade = 67;

        System.out.println(aluno2.nome);

        aluno1.apresentar();
        aluno2.apresentar();

        // Criando conta
        Conta conta1 = new Conta();
        conta1.titular = "Ricardo";
        conta1.setSaldo(156);

        System.out.println("Saldo atual: " + conta1.getSaldo());
        System.out.println("Saldo com depósito: " + conta1.depositar(50));
    }
}