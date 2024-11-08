package academy.italo.devmagro.topico03;

public class Ex18 {
    public static void main(String[] args) {

        float qntAnos = 0;
        float alturaFrancisco = 1.50f;
        float alturaSarah = 1.10f;


        while (alturaFrancisco >= alturaSarah){
            qntAnos += 0.1F;
            alturaFrancisco = 1.50f + (2 * qntAnos);
            alturaSarah = 1.10f + (3 * qntAnos);

            if(alturaFrancisco > alturaSarah){
                break;
            }
        }

        System.out.println("---Calculo---");
        System.out.println("Francisco: " + alturaFrancisco + " metros");
        System.out.println("Sarah: " + alturaSarah + " metros");
        System.out.println("Anos necessários: " + qntAnos);
        System.out.println("--------------");
    }
}
