package academy.italo.soffner.cap5;

import java.util.Scanner;

public class Ex08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeAlunos = 10;
        int quantidadeDeProvas = 3;
        float somaDaTurma = 0;
        float somaDoAluno = 0;
        float[][] notasDosAlunos = new float[quantidadeDeAlunos][quantidadeDeProvas];

        for (int i = 0; i < notasDosAlunos.length ; i++) {
            System.out.println("ALUNO " + (i+1));
            for (int j = 0; j < notasDosAlunos[i].length; j++) {
                System.out.print("Digite sua nota: ");
                notasDosAlunos[i][j] = scanner.nextFloat();
                scanner.nextLine();
                somaDaTurma += notasDosAlunos[i][j];
                somaDoAluno += notasDosAlunos[i][j];
            }
            System.out.printf("Média do aluno: %.2f", somaDoAluno/quantidadeDeProvas);
            System.out.print("\n\n");
            somaDoAluno = 0;
        }

        System.out.println("--MÉDIA DA TURMA--");
        System.out.println(somaDaTurma/(quantidadeDeAlunos * quantidadeDeProvas));


    }
}
