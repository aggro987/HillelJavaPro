package Les6.HW.Abstract;

public abstract class Partecipanti {

    private final String NAME;
    private int maxLength;
    private int maxJump;

    public Partecipanti(String NAME, int maxLength, int maxJump) {
        this.NAME = NAME;
        this.maxLength = maxLength;
        this.maxJump = maxJump;
    }

    public abstract int run();

    public abstract int jump();


    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public String getNAME() {
        return NAME;
    }
}
