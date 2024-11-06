package entities;

public class Conta {

    private String numero;
    private String nome;
    private double saldo = 0;
    private String cpf;


    //Construtor
    public Conta(String nome, String cpf, double depositoInicial) {
        this.cpf = cpf;
        this.nome = nome;

        this.deposito(depositoInicial);
    }

    public Conta(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = 0;
    }



    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String deposito(double dinheiro) {
        if (dinheiro <= 0) {
            return "Impossível fazer um depósito negativo!";
        } else {
            this.saldo += dinheiro;
            return "Depósito realizado com sucesso!";
        }
    }

    public String sacar(double dinheiro) {
        if (dinheiro <= 0) {
            return "impossível realizar um saque negativo ou nulo";
        }

        if (this.saldo - dinheiro < 0) {
            return "Impossível sacar";
        } else {
            this.saldo -= dinheiro;
            this.saldo -= 5;
            return "Saque realizado com sucesso";
        }
    }

    public String getCpf() {
        return cpf;
    }

}
