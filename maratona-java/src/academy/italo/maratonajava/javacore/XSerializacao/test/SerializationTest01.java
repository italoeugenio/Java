package academy.italo.maratonajava.javacore.XSerializacao.test;

import academy.italo.maratonajava.javacore.XSerializacao.dominio.Student;
import academy.italo.maratonajava.javacore.XSerializacao.dominio.StudentClass;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "ITALO", "12345");
        StudentClass studentClass = new StudentClass("Turma do Italo");
        student.setStudentClass(studentClass);
        serializar(student);
        deserializar();
    }

    // Quando você serializa, transforma um objeto em um array de bytes
    private static void serializar(Student student) {
        Path path = Paths.get("maratona-java/src/academy/italo/maratonajava/javacore/XSerializacao/test/file/.student.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Quando você desserializa, transforma o array de bytes de volta em objeto
    private static void deserializar() {
        Path path = Paths.get("maratona-java/src/academy/italo/maratonajava/javacore/XSerializacao/test/file/.student.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}