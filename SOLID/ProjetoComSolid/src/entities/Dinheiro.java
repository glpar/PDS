package entities;

import Interface.Pagamento;

public class Dinheiro implements Pagamento {
    private Double valor;


    public Dinheiro(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    @Override
    public void pagamento(Pagamento dinheiro) {
        System.out.println("Pagamento realizado");
    }
}
