package entities;


import java.util.ArrayList;
import java.util.List;

public class GerenciadorClientes {
    private List<Cliente> gerenciadorClientes = new ArrayList<>();

    public GerenciadorClientes() {

    }

    public List<Cliente> getGerenciadorClientes() {
        return gerenciadorClientes;
    }

    public void setGerenciadorClientes(List<Cliente> gerenciadorClientes) {
        this.gerenciadorClientes = gerenciadorClientes;
    }

    public void addCliente(Cliente cliente){
        gerenciadorClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
    gerenciadorClientes.remove(cliente);
    }
}
