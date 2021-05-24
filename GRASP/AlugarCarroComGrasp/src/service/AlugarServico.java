package service;

import entities.AlugarCarro;
import entities.Nota;

public class AlugarServico {
    private Double preçoPorHora;
    private Double preçoPorDia;

    private TaxaServico taxaServico;

    public AlugarServico(Double preçoPorHora, Double preçoPorDia, TaxaServico taxaServico) {
        this.preçoPorHora = preçoPorHora;
        this.preçoPorDia = preçoPorDia;
        this.taxaServico = taxaServico;
    }

    public void emitirNota(AlugarCarro carro){
        long t1 = carro.getInicio().getTime();
        long t2 = carro.getFim().getTime();
        double tempo = (double) (t2 - t1) / 1000 / 60 / 60;
        double pagamentoBasico;
        if(tempo <= 12.0){
            pagamentoBasico = Math.ceil(tempo) * preçoPorHora;
        }else{
            pagamentoBasico = Math.ceil(tempo / 24) * preçoPorDia;
        }

        double taxa = taxaServico.taxa(pagamentoBasico);
        carro.setNota(new Nota(pagamentoBasico,taxa));
    }
}
