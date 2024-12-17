package academy.italo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi2Eren9Mikasa";
        String[] nomes = texto.split("\\d");

        for(String nome:nomes){
            System.out.println(nome);
        }

        String texto2 = "Java é      foda    de+";
        String[] textos2 = texto2.split("\\s");

        for(String textos:textos2){
            System.out.println(textos);
        }
    }
}
