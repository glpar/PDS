package entities;

import java.util.ArrayList;
import java.util.List;
import Interface.Secoes;

public class GerenciadorSecoes {
    private List<Secoes> secoes = new ArrayList<>();

    public GerenciadorSecoes() {
    }

    public List<Secoes> getSecoes() {
        return secoes;
    }

    public void setSecoes(List<Secoes> secoes) {
        this.secoes = secoes;
    }

    public boolean addSecao(Secoes secao){
        if(secoes.add(secao)){
            return true;
        }
        return false;
    }

    public boolean removerSecao(Secoes secao){
        if(secoes.remove(secao)){
            return true;
        }
        return false;
    }

    public List<Secoes> listarSecoes(){
        return secoes;
    }
}
