package externalsfactors;

public enum Surfaces {
    FLOOR("пол");
    private final String str;

    Surfaces(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
