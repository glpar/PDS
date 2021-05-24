package entities;

import Interface.Secoes;

import java.util.ArrayList;
import java.util.List;

public class SecaoComercial implements Secoes {

    private List<Produtos> produtos = new ArrayList<>();

    public SecaoComercial() {
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produtos produto){
        produtos.add(produto);
    }

    public void removerProduto(Produtos produto){
        produtos.remove(produto);
    }

    @Override
    public void abrirSecao(Secoes secao) {
        System.out.println("Abrir seção comercial");
    }
}
