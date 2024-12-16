package academy.italo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1%3, ou seja, qualquer valor entre 1 e 3
        String regex = "([a-zA-Z0-9._-+])";
        String texto = "kirito@hotmail.com, 123jordan@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
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
