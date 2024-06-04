package academy.italo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        days[1][0] = 4;
        days[1][1] = 5;
        days[1][2] = 6;

        for(int[] baseArray :days){
            for(int num:baseArray){
                System.out.println(num);
            }
        }
    }
}
