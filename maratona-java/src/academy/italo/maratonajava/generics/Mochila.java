package academy.italo.maratonajava.generics;

import java.util.ArrayList;

public class Mochila<T> {
    private ArrayList<T> ferramentas;

    public Mochila() {
        this.ferramentas = new ArrayList<>();
    }

    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public void mostarFerramentas(){
        for(T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }

    public ArrayList<T> getFerramentas() {
        return ferramentas;
    }
}
