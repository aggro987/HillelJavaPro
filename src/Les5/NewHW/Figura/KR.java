package Les5.NewHW.Figura;

public class KR extends Figura {

    int radius;

    public KR(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double pl() {
        return radius * 777;
    }
}
