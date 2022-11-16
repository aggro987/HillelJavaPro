package Les5.NewHW.Figura;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new KR("KR1", 10),
                new Kv("Kv1", 10),
                new KR("KR2", 20)};

        for (Figura f : figuras) {
            System.out.println(f.name + " - " + f.pl());
        }

    }
}
