package academy.italo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Ítalo"; //String constant pool
        String nome2 = "Ítalo";
        nome = nome.concat(" Santana"); //NAME += " Santana"

        System.out.println(nome);
        System.out.println(nome == nome2); // Comparando referencia do objeto

        String nome3 = new String("Ítalo"); // Cria uma variável de referência, 2 objeto do tipo string, uma string no pool string (PROVAVELMENTE NUNCA VAI USAR ISSO COM NEW)
        System.out.println("---");
        System.out.println(nome2.equals(nome3)); // Comparando o conteúdo
        System.out.println(nome2 == nome3 );
        System.out.println(nome == nome3.intern());



    }
}
