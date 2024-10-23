package academy.italo.soffner.cap6;

public class Ex02 {
    public static float calcularDivisao(float num1, float num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        System.out.println(calcularDivisao(10,0));
    }
}
