package academy.italo.maratonajava.generics;

public class TesteMain {
    public static void main(String[] args){
        Teste teste = new Teste();
        teste.adicionarIntens(12);
        teste.adicionarIntens(13);
        teste.adicionarIntens(14);

        System.out.println(teste.getLista());
    }
}
