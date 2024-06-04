package academy.italo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[] {2,4,6,8,10};

        for (int number: numbers2){
            System.out.println(number);
        }
        System.out.println("-------####------#####-------");
        for(int number: numbers3){
            System.out.println(number);
        }


    }
}
