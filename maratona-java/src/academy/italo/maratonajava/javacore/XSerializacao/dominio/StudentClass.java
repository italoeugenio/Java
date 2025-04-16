package academy.italo.maratonajava.javacore.XSerializacao.dominio;

import java.io.Serializable;

public class StudentClass implements Serializable {
    private String name;

    public StudentClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                '}';
    }
}