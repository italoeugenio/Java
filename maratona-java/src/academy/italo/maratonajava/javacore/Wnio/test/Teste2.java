package academy.italo.maratonajava.javacore.Wnio.test;

public class Teste2 {
    public static void main(String[] args) {
        Teste[] teste = {new Teste(2), new Teste(3), new Teste(4)};


        for(Teste testes: teste) {
            System.out.println(testes.getValor());
        }
    }
}
