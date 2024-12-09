package academy.italo.maratonajava.javacore.Rdates.test;

import java.time.ZoneId;
import java.util.Map;

public class ZoneTeste01 {
    public static void main (String[] args){
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
    }
}
