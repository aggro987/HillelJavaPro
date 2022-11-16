package Les4.neww1;

public class Cat1 extends Animal1 {
    private static int count;


    public Cat1(String name) {
        super(name);
        count++;
    }

    public void swim() {
        System.out.println(super.getName() + " не умеют плавать!");
    }

    public void run(int dist) {
        if (dist > 200) {
            System.out.println(super.getName() + " не может пробежать " + dist + " метров.");
        } else if (dist < 1) {
            System.out.println(super.getName() + " ничего не пробежал");
        } else super.run(dist);
    }

    public static int getCount() {
        return count;
    }
}
