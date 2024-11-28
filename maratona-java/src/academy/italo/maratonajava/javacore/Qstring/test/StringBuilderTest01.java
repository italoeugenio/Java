package academy.italo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // String Builder não é uma String, ou seja, ela não é imutável
        String nome = "Ítalo Eugênio";
        nome = nome.concat(" Santana");
        System.out.println(nome);
        StringBuilder sb= new StringBuilder("Ítalo Eugênio"); //Se não passar nada o padrão fica 16 do tamanho
        sb.append(" Santana").append(" Teste");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

//        //Tudo isso funciona para StringBuffer tmb, a única diferença entre eles é que:
//        StringBuilder não é sincronizado.
//        StringBuffer é sincronizado.
    }
}
