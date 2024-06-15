package homework5;

public class Dog extends Animal {
    protected String klyki;

    @Override
    public void eat() {
        System.out.println("Собака кушает");
    }

    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    public String getKlyki() {
        return klyki;
    }

    public void setKlyki(String klyki) {
        this.klyki = klyki;
    }

}

