package academy.italo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest02 {
    private static int divisao(int num1, int num2){
       if(num2 == 0){
           throw new IllegalArgumentException("Num1 não pode ser 0");
       }
       return num1 / num2;
    }

    public static void main(String[] args) {
        try{
            System.out.println(divisao(1,0));
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Código finalizado ");
    }
}
