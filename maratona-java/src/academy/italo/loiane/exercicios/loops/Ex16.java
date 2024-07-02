package academy.italo.loiane.exercicios.loops;

public class Ex16 {
    public static int fibonacci(int num1){
        int fibonacci = (num1 - (1)) + (num1 - 2);
        return fibonacci;
    }
    // Método para calcular o número de Fibonacci de um dado número
//    public static int fibonacci(int num) {
//        if (num <= 1) {
//            return num;
//        } else {
//            return fibonacci(num - 1) + fibonacci(num - 2);
//        }
//    }
    public static void main(String[] args) {
        for (int x = 2; x > 1; x++){
            if (fibonacci(x) > 500){
                System.out.println(fibonacci(x));
                break;
            }
        }
    }
}
