package academy.italo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Ítalo";
        names[1] = "Camilla";
        names[2] = "Sarah";

        for (String name : names) {
            System.out.println(name);
        }

        //Perde a referência
        names = new String[3];
        for (String name : names) {
            System.out.println(name);
        }
    }
}
