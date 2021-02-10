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

    public void increaseFood(int n) {
        if(n >= 0)  {
            food += n;
        } else {
            System.out.printf("Insufficient value!\n");
        }
    }

    // Уменьшение еды.
    // Если аппетит (параметр n) больше, чем остаток (food) - остаток остаётся, результат = false.
    public boolean decreaseFood(int n) {

        boolean result = false;

        if(n < food) {
            food -= n;
            result = true;
        }

        return result;
    }
}
