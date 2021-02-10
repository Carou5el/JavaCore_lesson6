package kulkov.JavaCore.Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    
        int CATS_ARRAY_SIZE = 10;
        int PLATE_INIT_SIZE = 30;

        Plate plate = new Plate(PLATE_INIT_SIZE);
        Cat[] cats = new Cat[CATS_ARRAY_SIZE];
        initCatArray(cats);

        // Вывод инфы об объекте "Тарелка".
        plate.info();
        
        // Команда "Обедать"!
        letEat(cats, plate);
        
        // Получаем инфу о свойствах котеек.
        for(Cat cc : cats) {
            System.out.printf("Name: %s\t full: %b\n", cc.getName(), cc.isFull());
        }

        plate.info();
        // Подкинем еды в тарелку.
        plate.increaseFood(10);
        // "Обедать"!
        letEat(cats, plate);

        for(Cat cc : cats) {
            System.out.printf("Name: %s\t full: %b\n", cc.getName(), cc.isFull());
        }

    }

    public static void letEat(Cat[] cats, Plate plate) {
        for(int i = 0; i < cats.length; i++)    {
            cats[i].eat(plate);
        }
    }
    // Инициализация котов.
    public static void initCatArray(Cat[] cats) {

        Random generator = new Random();
        String catsName;
        int catsAppetite;

        for(int i = 0; i < cats.length; i++)    {
            catsName = ("Kitty" + i);
            catsAppetite = generator.nextInt(10);

            cats[i] = new Cat(catsName, catsAppetite);
        }
    }
}
