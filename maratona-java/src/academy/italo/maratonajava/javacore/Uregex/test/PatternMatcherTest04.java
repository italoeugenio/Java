package academy.italo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Todos os espacos em branco /t /n /f /r
        // \S = Tudo menos os espacos em branco
        // \w = a-Z A-, digitos e _
        // \W = Tudo que nao for: a-Z A-, digitos e _
        // []
        // ? Zero ou uma
        // * Zerou ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | Significa "ou" o(v|c)o = ovo ou oco
        // $
        String regex = "0[xX]([0-9a-fA-F]{1,8})+(\\s|$)";
        String texto = "12 0x 0X 0xFFaBC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Text: " + texto);
        System.out.println("regex " + regex);
        System.out.println("Positions found:");
        while(matcher.find()){
            System.out.print(matcher.start() +  " " + matcher.group() + "\n");
        }
    }
}
