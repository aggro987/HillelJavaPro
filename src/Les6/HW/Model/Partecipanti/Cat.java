package Les6.HW.Model.Partecipanti;

import Les6.HW.Abstract.Partecipanti;

public class Cat extends Partecipanti {

    public Cat(String NAME, int maxLength, int maxJump) {
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
