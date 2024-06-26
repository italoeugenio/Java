package academy.italo.loiane.exercicios.loops;

public class Ex16 {
    public static int fibonacci(int num1){
        int fibonacci = (num1 - (1)) + (num1 - 2);
        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
