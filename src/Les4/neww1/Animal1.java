package Les4.neww1;

public class Animal1 {
    private String name;

    public Animal1(String name) {
        this.name = name;
    }

    public void run(int dist) {
        System.out.println(name + " пробежал " + dist + " метров.");
    }

    public void swim(int dist) {
        System.out.println(name + " проплыл " + dist + " метров.");

    }

    public String getName() {
        return name;
    }
}
