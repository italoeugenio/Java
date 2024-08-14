package academy.italo.soffner.cap2;

public class Ex10 {
    public static void main(String[] args){

        int numero = 5;

        System.out.println("\nTABUADA DO " +  numero);
        for(int x = 0; x <= 10; x++){
            System.out.printf("%d * %d = %d%n", x, numero, (x*numero));
        }
    }
}
