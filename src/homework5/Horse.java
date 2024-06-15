package homework5;

public class Horse extends Animal {


    protected String kopyta;

    public void eat() {
        System.out.println("Лошадь кушает");
    }
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    public String getKopyta() {
        return kopyta;
    }

    public void setKopyta(String kopyta) {
        this.kopyta = kopyta;
    }

}
