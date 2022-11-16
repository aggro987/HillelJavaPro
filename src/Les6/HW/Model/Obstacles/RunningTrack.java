package Les6.HW.Model.Obstacles;

import Les6.HW.Abstract.Obstacles;
import Les6.HW.Abstract.Partecipanti;

public class RunningTrack extends Obstacles {
    private static final String NAME = "Беговая дорожка";
    private final int length;

    public RunningTrack(int length) {
        super(NAME);
        this.length = length;

    }

    @Override
    public boolean overcome(Partecipanti partecipanti) {
        if (partecipanti.run() >= length) {
            System.out.println("Учасник " + partecipanti.getNAME() + " смог преодолеть препядствие \"" + NAME +
                    "\" на дистанции " + length + " метров.");
            return true;
        } else {
            System.out.println("Учасник " + partecipanti.getNAME() + " не смог преодолеть препядствие \"" + NAME +
                    "\" на дистанции " + length + " метров. Смог только: " + partecipanti.getMaxLength() + " м.");
            return false;
        }
    }


    public int getLength() {
        return length;
    }

}
