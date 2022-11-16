package Les6.HW.Abstract;

public abstract class Obstacles {

    private final String NAME;

    protected Obstacles(String name) {
        NAME = name;
    }

    public abstract boolean overcome(Partecipanti partecipanti);

    public String getNAME() {
        return NAME;
    }
}
