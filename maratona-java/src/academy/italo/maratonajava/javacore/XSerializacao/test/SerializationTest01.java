//package academy.italo.maratonajava.javacore.XSerializacao.test;
//
//import academy.italo.maratonajava.javacore.XSerializacao.dominio.Student;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class SerializationTest01 {
//    public static void main(String[] args) {
//        Student student = new Student(1L, "ITALO", "12345");
//        serializar(student);
//    }
//
//    // Quando você serializa, você transforma um objeto em um array de bytes
//    private static void serializar(Student student) {
//        Path path = Paths.get("pasta /aluno.ser");
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path)) {
//            objectOutputStream.writeObject(student);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }}
//}
//
