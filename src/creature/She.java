package creature;

public class She extends Shorty implements RemoveTheLeashFromThePetInterface {
    private final Dog poodle = new Poodle(this);

    public She() {
        super(6, "Госпожа", 'f');
    }

    public Dog getPet(){
        return poodle;
    }

    public void removeTheLeashFromThePet(){
        poodle.removeTheLeash();
    }

    @Override
    public String toString() {
        return super.toString() + " Владеет домашним животным - " + this.poodle;
    }
}
