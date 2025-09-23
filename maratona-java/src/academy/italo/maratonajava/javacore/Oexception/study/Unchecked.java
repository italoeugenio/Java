package academy.italo.maratonajava.javacore.Oexception.study;

public class Unchecked {
    public static void main(String[] args) {
        String name = null;
        pritnLength(name);
        System.out.println("Teste");
    }

    private static void pritnLength(String mySring) {
        try {
            System.out.println(mySring.length());
        } catch (NullPointerException e) {
            System.out.println("String cannot be null");
        }
    }
}
