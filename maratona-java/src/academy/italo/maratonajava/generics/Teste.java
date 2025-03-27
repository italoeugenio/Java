package academy.italo.maratonajava.generics;

import java.util.*;

public class Teste {
    private List<Integer> lista;

    public Teste(){
        this.lista = new ArrayList<>();
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public void adicionarIntens(Integer item){
        lista.add(item);
    }
}
