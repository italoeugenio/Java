package academy.italo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void recursividade(){
        recursividade();
    }
    public static void main(String[] args) {
        recursividade();
    }
}
