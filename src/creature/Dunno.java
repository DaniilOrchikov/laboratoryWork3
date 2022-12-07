package creature;

import thing.Boots;

public class Dunno extends Shorty {
    private final Boots boots = new Boots();

    public Dunno() {
        super(7.5, "Незнайка", 'm');
    }

    public Boots getBoots() {
        return boots;
    }
}
