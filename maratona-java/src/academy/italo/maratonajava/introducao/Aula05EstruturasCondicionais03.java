package academy.italo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Donate if salary > 5000
        double salary = 5001 ;
        String mensageDonate = "I will donate 500 to \"Todos boiolas\" ";
        String mensageNoDonate = "I don´t have money, but I will get ";

        String result = salary > 5000 ? mensageDonate : mensageNoDonate;

        System.out.println(result);
    }
}
