package academy.italo.jogos.forca;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Palavra {
    private final List<String> palavras =
            Arrays.asList("computador", "arroz", "feijao","apple");
    private String palavraSecreta;
    private String palavraComChute;


    public Palavra(String palavraSecreta, String palavraComChute) {
        this.palavraSecreta = palavraSecreta;
        this.palavraComChute = palavraComChute;
    }

    public void sortearPalavraSecreta(){
        Random random = new Random();
        int tamanhoDalista = this.palavras.size()-1;
        int numeroAleatorio = random.nextInt(palavras.size());
        this.palavraSecreta = palavras.get(numeroAleatorio);
    }

    public List<String> getPalavras() {
        return palavras;
    }

    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public void setPalavraSecreta(String palavraSecreta) {
        this.palavraSecreta = palavraSecreta;
    }

    public String getPalavraComChute() {
        return palavraComChute;
    }

    public void setPalavraComChute(String palavraComChute) {
        this.palavraComChute = palavraComChute;
    }


}
