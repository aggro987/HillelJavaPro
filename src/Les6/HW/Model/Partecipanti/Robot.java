package Les6.HW.Model.Partecipanti;

import Les6.HW.Abstract.Partecipanti;

public class Robot extends Partecipanti {


    public Robot(String NAME, int maxLength, int maxJump) {
        super(NAME, maxLength, maxJump);
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
