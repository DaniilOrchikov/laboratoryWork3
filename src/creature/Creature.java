package creature;

import externalsfactors.Speed;
import externalsfactors.Surfaces;

public abstract class Creature implements MoveInterface {
    private static int id;
    private final int obj_id;
    private final String name;
    private final char gender;

    public Creature(String name, char gender) {
        this.name = name;
        this.gender = gender;
        id += 1;
        obj_id = id;
    }

    public String getName() {
        return name;
    }

    public int getId(){return obj_id;}

    public char getGender() {
        return gender;
    }

    public void go(Creature creature, Speed speed) {
        System.out.println(getName() + " " + speed + (getGender() == 'm' ? " подошел" : " подошла") + " к " + creature.getName());
    }

    public void go(Speed speed) {
        System.out.println(getName() + " " + speed + (getGender() == 'm' ? " пошел" : " пошла"));
    }

    public void sit() {
        System.out.println(getName() + (getGender() == 'm' ? " сел" : " села"));
    }

    public void sit(Surfaces surf) {
        System.out.println(getName() + (getGender() == 'm' ? " сел " : " села ") + "на " + surf);
    }

    @Override
    public int hashCode() {
        return obj_id;
    }
}

