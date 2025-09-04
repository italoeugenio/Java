package academy.italo.jogodavelha.game1;

public enum XorO {
    CHOOOSE_X("X"),
    CHOOOSE_O("O");

    private final String description;

    XorO(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
