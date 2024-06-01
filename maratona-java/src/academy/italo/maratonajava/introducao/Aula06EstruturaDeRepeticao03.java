package academy.italo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        //Imprimir os primeiros 25 números de um determinado valor.
        int maxValue = 50;

        for (int i = 1; i <= maxValue; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
