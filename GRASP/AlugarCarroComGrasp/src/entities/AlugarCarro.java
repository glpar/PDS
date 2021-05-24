package entities;

import java.util.Date;

public class AlugarCarro {
    private Date inicio;
    private Date fim;

    private Veiculo modelo;
    private Nota nota;

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

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
}
