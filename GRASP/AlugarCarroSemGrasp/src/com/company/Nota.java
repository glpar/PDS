package com.company;

public class Nota {

    private Double pagamentoBasico;
    private Double pagamentoHora;
    private Double pagamentoDia;
    private Double taxa;

    public Nota(Double pagamentoHora, Double pagamentoDia) {
        this.pagamentoHora = pagamentoHora;
        this.pagamentoDia = pagamentoDia;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getPagamentoHora() {
        return pagamentoHora;
    }

    public void setPagamentoHora(Double pagamentoHora) {
        this.pagamentoHora = pagamentoHora;
    }

    public Double getPagamentoDia() {
        return pagamentoDia;
    }

    public void setPagamentoDia(Double pagamentoDia) {
        this.pagamentoDia = pagamentoDia;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double pagamentoCarroTotal(Double horas){
        if(horas <= 12){
            pagamentoBasico = Math.ceil(horas)* pagamentoHora;
        }else{
            pagamentoBasico = Math.ceil(horas / 24) * pagamentoDia;
        }

        if(pagamentoBasico <= 100){
            taxa = pagamentoBasico * 0.2;
            return pagamentoBasico + taxa;
        }else{
            taxa = pagamentoBasico * 0.15;
            return pagamentoBasico + taxa;
        }
    }
}
