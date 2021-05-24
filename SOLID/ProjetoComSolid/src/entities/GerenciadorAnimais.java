package entities;


import java.util.ArrayList;
import java.util.List;

public class GerenciadorAnimais {
    private List<Animais> animais = new ArrayList<>();

    public GerenciadorAnimais() {
    }

    public List<Animais> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animais> animais) {
        this.animais = animais;
    }

    public boolean addAnimal(Animais animal) {
        if (animais.add(animal)) {
            return true;
        }
        return false;
    }

    public boolean removerAnimal(Animais animal) {
        if (animais.remove(animal)) {
            return true;
        }
        return false;
    }

    public List<Animais> listarAnimais() {
        return animais;
    }

}
