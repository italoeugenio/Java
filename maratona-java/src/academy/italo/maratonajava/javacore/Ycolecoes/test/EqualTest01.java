package academy.italo.maratonajava.javacore.Ycolecoes.test;

import academy.italo.maratonajava.javacore.Ycolecoes.dominio.SmartPhone;


public class EqualTest01 {
    public static void main(String[] args) {
        String name = "Italo";
        String name2 = new String("Italo");

        System.out.println(name == name2); //Refencia de memória
        System.out.println(name.equals(name2)); //Conteúdo

        SmartPhone s1 = new SmartPhone("1ABC1","iPhone");
        SmartPhone s2 = s1;

        System.out.println("---SMARTPHONE---");
        System.out.println(s1.equals(s2));


    }
}
