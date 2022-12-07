package creature;

import thing.Thing;

public interface SniffInterface {
    public void sniff(Creature... creatures);

    public void sniff(Thing... things);
}
