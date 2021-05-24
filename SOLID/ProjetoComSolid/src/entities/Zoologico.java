package entities;

import Interface.Pagamento;

public class Zoologico implements Pagamento {
    private Double caixa;
    private GerenciadorAnimais gerenciadorAnimais;
    private GerenciadorSecoes gerenciadorSecoes;
    private GerenciadorClientes gerenciadorClientes;
    private Pagamento pagamento;

    public Zoologico(Double caixa, GerenciadorAnimais gerenciadorAnimais, GerenciadorSecoes gerenciadorSecoes, GerenciadorClientes gerenciadorClientes, Pagamento pagamento) {
        this.caixa = caixa;
        this.gerenciadorAnimais = gerenciadorAnimais;
        this.gerenciadorSecoes = gerenciadorSecoes;
        this.gerenciadorClientes = gerenciadorClientes;
        this.pagamento = pagamento;
    }

    public Double getCaixa() {
        return caixa;
    }

    public void setCaixa(Double caixa) {
        this.caixa = caixa;
    }

    public GerenciadorAnimais getGerenciadorAnimais() {
        return gerenciadorAnimais;
    }

    public void setGerenciadorAnimais(GerenciadorAnimais gerenciadorAnimais) {
        this.gerenciadorAnimais = gerenciadorAnimais;
    }

    public GerenciadorSecoes getGerenciadorSecoes() {
        return gerenciadorSecoes;
    }

    public void setGerenciadorSecoes(GerenciadorSecoes gerenciadorSecoes) {
        this.gerenciadorSecoes = gerenciadorSecoes;
    }

    public GerenciadorClientes getGerenciadorClientes() {
        return gerenciadorClientes;
    }

    public void setGerenciadorClientes(GerenciadorClientes gerenciadorClientes) {
        this.gerenciadorClientes = gerenciadorClientes;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public void pagamento(Pagamento pagamento) {
        pagamento.pagamento(pagamento);
    }

}
