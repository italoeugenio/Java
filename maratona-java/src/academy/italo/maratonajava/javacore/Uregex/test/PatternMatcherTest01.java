package academy.italo.maratonajava.javacore.Uregex.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
//        String text1 = "abaaba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("Text: " + text2);
        System.out.println("regex " + regex);
        System.out.println("Positions found:");
        while(matcher.find()){
            System.out.print(matcher.start() +  " ");
        }
    }
}
