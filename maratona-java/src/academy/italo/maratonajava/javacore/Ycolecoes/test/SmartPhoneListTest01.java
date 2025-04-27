package academy.italo.maratonajava.javacore.Ycolecoes.test;

import academy.italo.maratonajava.javacore.Ycolecoes.dominio.SmartPhone;

import java.util.*;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1", "Iphone");
        SmartPhone s2 = new SmartPhone("22222", "Pixel");
        SmartPhone s3 = new SmartPhone("33333", "Samsung");

        List<SmartPhone> smartPhoneList = new ArrayList<>(6);
        smartPhoneList.add(s1);
        smartPhoneList.add(s2);
        smartPhoneList.add(s3);

        for(SmartPhone smartPhone: smartPhoneList){
            System.out.println(smartPhone);
        }
    }
}
