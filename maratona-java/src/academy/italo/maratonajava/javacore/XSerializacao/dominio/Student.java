package academy.italo.maratonajava.javacore.XSerializacao.dominio;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 3499108540197341L;
    private Long id;
    private String name;
    private transient String password;
    private static final String DONTCHANGE = "I AM STATIC";
    private transient StudentClass studentClass;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(studentClass.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            // Corrigido: uso errado do objectOutputStream, substituído corretamente por leitura
            String className = objectInputStream.readUTF();
            this.studentClass = new StudentClass(className);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", DONTCHANGE=" + DONTCHANGE +
                ", StudentClass=" + studentClass +
                '}';
    }
}