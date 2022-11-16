package Les6.HW.Model.Partecipanti;

import Les6.HW.Abstract.Partecipanti;

public class Human extends Partecipanti {


    public Human(String name, int maxLength, int maxJump) {
        super(name, maxLength, maxJump);

    }

    @Override
    public int run() {
        return getMaxLength();
    }

    @Override
    public int jump() {
        return getMaxJump();
    }


}
