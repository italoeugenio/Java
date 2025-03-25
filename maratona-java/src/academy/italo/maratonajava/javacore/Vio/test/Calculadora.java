package academy.italo.maratonajava.javacore.Vio.test;

public class Calculadora {
    public static int somar(int num1, int num2){
        return  num1 + num2;
    }

    public static int somar(int num1, int num2, int num3){
        return  num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println(Calculadora.somar(3,4,5));
    }
}


