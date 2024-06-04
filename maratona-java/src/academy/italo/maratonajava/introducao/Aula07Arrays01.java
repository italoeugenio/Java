package academy.italo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] ages = new int[100];
        ages[0] = 20;
        ages[1] = 21;
        ages[2] = 22;

        for (int x = 0; x < ages.length; x++){
            System.out.println(ages[x]);
        }
    }
}
