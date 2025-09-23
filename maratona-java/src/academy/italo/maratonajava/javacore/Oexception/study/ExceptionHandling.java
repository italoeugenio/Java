package academy.italo.maratonajava.javacore.Oexception.study;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
           getInt();
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("You need use a number ");
        }finally {
            System.out.println("I always be ");
        }
        System.out.println("i am in the final ");
    }

    private static void getInt(){
        int myint = Integer.parseInt("pants");
    }
}
