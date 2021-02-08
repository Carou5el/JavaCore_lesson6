package kulkov.JavaCore.Lesson6;

public class Plate {

    private int food;

    public void setFood(int food) {
        this.food = food;
    }

    // Constructors.
    public Plate(int food) {
        this.food = food;
    }

    // Methods.
    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {

        if(n > food)    {
            System.out.printf("Insufficient balance!\n");
        } else {
            food -= n;
        }
    }
}
