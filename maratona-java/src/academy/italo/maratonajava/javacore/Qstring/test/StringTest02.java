package academy.italo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args){
        String nome = "Kirito";
        String nome1 = "  REmove os valores em branco do começo e no fim da string  ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace('i', 'o'));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.substring(3));
        System.out.println(nome.substring(0,2));
        System.out.println(nome1.trim());
    }
}
