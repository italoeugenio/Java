package academy.italo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main (String[] args){
        int num = 0;
        //números pares de 0 ate 100
        while (num <= 1000000){
            if (num % 2 == 0 || num == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
