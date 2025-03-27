package academy.italo.generics;

import java.util.ArrayList;

public class Mochila<T> {
    private ArrayList<T> ferramentas;

    public Mochila() {

    }

    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public void mostarFerramentas(){
        for(T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }
}
