package academy.italo.jogodavelha.game1;

public class Player {
    private String name;
    private Integer points;
    private XorO choose;


    public Player(String name, XorO choose) {
        this.name = name;
        this.points = 0;
        this.choose = choose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public XorO getChoose() {
        return choose;
    }

    public void setChoose(XorO choose) {
        this.choose = choose;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", choose=" + choose.getDescription() +
                '}';
    }
}
