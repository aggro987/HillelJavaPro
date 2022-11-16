package Les4.neww1;

import java.util.NoSuchElementException;

public class Dog1 extends Animal1 {
    private static int count;


    public Dog1(String name) {
        super(name);
        count++;
    }

    public void run(int dist) {
        if (dist > 500 || dist < 1) {
            System.out.println("Неверное значение");
        } else super.run(dist);

    }

    public void swim(int dist) {
        if (dist > 10 || dist < 1) {
            System.out.println("Неверное значение.");
        } else super.swim(dist);
    }

    public static int getCount() {
        return count;
    }
}
