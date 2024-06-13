package academy.italo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.italo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Remis";
        professor.idade = 64;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);

    }
}
