package academy.italo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manga{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(price, manga.price) == 0 && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this < outroManga
        // se o this ==  outroManga, return 0
        //positivo se this > outroManga
//        if(this.id < outroManga.id) return -1;
//        if(this.id.equals(outroManga.getId())) return 0;
//        return 1;

        return Double.valueOf(price).compareTo(outroManga.getPrice());
    }
}
