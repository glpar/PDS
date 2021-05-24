package entities;
import Interface.Secoes;

import java.util.ArrayList;
import java.util.List;

public class SecaoAlimentacao implements Secoes {

    private List<Produtos> alimentos = new ArrayList<>();

    public SecaoAlimentacao() {
    }

    public List<Produtos> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Produtos> alimentos) {
        this.alimentos = alimentos;
    }

    public void addAlimento(Produtos alimento){
        alimentos.add(alimento);
    }

    public void removerAlimento(Produtos alimento){
        alimentos.remove(alimento);
    }

    @Override
    public void abrirSecao(Secoes secao) {
        System.out.println("Abrir seção de alimentação");
    }
}
