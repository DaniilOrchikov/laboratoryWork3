package creature;

import externalsfactors.Speed;
import externalsfactors.Surfaces;

public interface MoveInterface {
    public void sit();

    public void sit(Surfaces surf);

    public void go(Creature creature, Speed speed);

    public void go(Speed speed);
}
