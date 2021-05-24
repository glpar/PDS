package entities;

public class Cliente {
    private String nome;
    private Double conta;

    public Cliente(String nome, Double conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getConta() {
        return conta;
    }

    public void setConta(Double conta) {
        this.conta = conta;
    }


    public Double faturaTotal(){
        return conta;
    }
}
