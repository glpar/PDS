package entities;
import Interface.Pagamento;

public class Cartao implements Pagamento {
    private Double valor;


    public Cartao(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public void pagamento(Pagamento cartao) {
        System.out.println("Fazer pagamento com o cartão");
    }
}
