package academy.italo.loiane.exercicios.loops;

public class Ex04 {
    public static void main(String[] args) {
        //https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2016%2017.pdf

        float populacaoA = 80000f;
        float populacaoB = 200000f;
        int anos = 0;

        while (true) {
            anos++;
            populacaoA += populacaoA * 0.03f;
            populacaoB += populacaoB * 0.015f;

            if (populacaoA >= populacaoB) {
                System.out.println("População A: " + populacaoA);
                System.out.println("População B: " + populacaoB);
                System.out.println("Levará aproximadamente " + anos + " anos para a População A igualar ou superar a População B.");
                break;
            }
        }
    }
}
