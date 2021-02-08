package kulkov.JavaCore.Lesson6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);

        // Вывод инфы об объекте "Тарелка".
        plate.info();
        //
        cat.eat(plate);
        plate.info();




    }
}
