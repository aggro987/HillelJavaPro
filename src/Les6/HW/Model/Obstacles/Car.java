package Les6.HW.Model.Obstacles;

import Les6.HW.Abstract.Obstacles;
import Les6.HW.Abstract.Partecipanti;

public class Car extends Obstacles {

    static private final String NAME = "Машина";
    private final int height;

    public Car(int height) {
        super(NAME);
        this.height = height;
    }

    @Override
    public boolean overcome(Partecipanti partecipanti) {
        if (partecipanti.jump() >= height ) {
            System.out.println("Учасник " + partecipanti.getNAME() + " смог преодолеть препядствие \"" + NAME +
                    "\" на высоту " + height + " метров.");
            return true;
        } else {
            System.out.println("Учасник " + partecipanti.getNAME() + " не смог преодолеть препядствие \"" + NAME +
                    "\" на высоту " + height + " метров. Смог только "+partecipanti.getMaxJump()+" м.");
            return false;
        }
    }
}
