package academy.italo.devmagro.topico03;

public class Ex19 {
    public static void main(String[] args) {

        for(int i = 0; i <=10; i++){
            System.out.println("Tabuada do " + i);
            for(int j = 0; j <= 10; j++){
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
            System.out.println();
        }
    }
}
