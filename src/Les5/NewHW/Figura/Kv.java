package Les5.NewHW.Figura;

public class Kv extends Figura {

    int storona;

    public Kv(String name, int storona) {
        super(name);
        this.storona = storona;
    }

    @Override
    double pl() {
        return storona * 100;
    }
}
