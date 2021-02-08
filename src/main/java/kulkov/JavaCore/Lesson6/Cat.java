package kulkov.JavaCore.Lesson6;

public class Cat {

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    // Fields.
    private String name;
    private int appetite;
    private boolean full = false;

    public boolean isFull() {
        return full;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    // Constructors.
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    // Methods.
    public void eat(Plate p) {
        full = p.decreaseFood(appetite);
    }
}
