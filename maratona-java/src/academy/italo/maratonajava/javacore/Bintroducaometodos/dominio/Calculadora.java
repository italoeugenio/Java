package academy.italo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //void não está retornando nada
    public void somarDoisNumeros(){
        System.out.println(10 +10);
    }

    public void subtraiDoiNumeros(){
        System.out.println(21-10);
    }

    public void multiplacaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num1 ==

                0 || num2 == 0){
            return 0;
        } else
            return num1/num2;
    }
}
