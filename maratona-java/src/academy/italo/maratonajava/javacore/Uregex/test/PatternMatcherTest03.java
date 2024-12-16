package academy.italo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Todos os espacos em branco /t /n /f /r
        // \S = Tudo menos os espacos em branco
        // \w = a-Z A-, digitos e _
        // \W = Tudo que nao for: a-Z A-, digitos e _
        // []
//        String regex = "[a-zA-C]";
//        String text1 = "abaaba";
        String regex = "0[xX][0-9a-fA-F]";
        String text2 = "12 0x 0X 0xFFaBC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("Text: " + text2);
        System.out.println("regex " + regex);
        System.out.println("Positions found:");
        while(matcher.find()){
            System.out.print(matcher.start() +  " " + matcher.group() + "\n");
        }
    }
}
