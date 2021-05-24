package com.company;

import java.util.Date;

public class AlugarCarro {

    private Date inicio;
    private Date fim;
    private Veiculo modelo;
    private Nota notaFiscal;

    public AlugarCarro(Date inicio, Date fim, Veiculo modelo) {
        this.inicio = inicio;
        this.fim = fim;
        this.modelo = modelo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Veiculo getModelo() {
        return modelo;
    }

    public void setModelo(Veiculo modelo) {
        this.modelo = modelo;
    }

    public Nota getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Nota notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Double getTempoAlugado(){
        double horas;
        horas = (double) (fim.getTime() - inicio.getTime()) / 1000 / 3600;
        return horas;
    }
}
