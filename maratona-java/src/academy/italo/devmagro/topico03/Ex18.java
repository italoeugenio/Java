package academy.italo.devmagro.topico03;

public class Ex18 {
    public static void main(String[] args) {

        int qntAnos = 0;

        float calculoDoFrancisco = 1.50f + (2 * qntAnos);
        float calculoDaSarah = 1.10f + (3 * qntAnos);

        while(true){
            System.out.println("---Calculo---");
            System.out.println("Francisco: " + calculoDoFrancisco);
            System.out.println("Sarah: " + calculoDaSarah);
            System.out.println("Anos: " + qntAnos);
            System.out.println("--------------");
            System.out.println();
            qntAnos++;

            calculoDoFrancisco = 1.50f + (2 * qntAnos);
            calculoDaSarah = 1.10f + (3 * qntAnos);

            if(calculoDoFrancisco > calculoDaSarah){
                break;
            }
        }
        System.out.println("Francisco será maior que Sara após " + qntAnos + " anos.");
    }
}
