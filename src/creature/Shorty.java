package creature;

public abstract class Shorty extends Creature implements SpeakInterface, BowDownInterface {
    private final double height;

    public Shorty(double height, String name, char gender) {
        super(name, gender);
        this.height = height;
    }

    public void bowDown() {
        System.out.println(getName() + (getGender() == 'f'? " поклонилась " : " поклонился "));
    }

    public void speak(String str) {
        System.out.println(getName() + (getGender() == 'f'? " сказала " : " сказал " + str));
    }

    public String toString() {
        return "Коротышка " + (getGender() == 'f' ? "девочка" : "мальчик") + " по имени " + this.getName() + ". Рост - " + this.height + " см.";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorty s = (Shorty) o;
        return getId() == s.getId();
    }
}
