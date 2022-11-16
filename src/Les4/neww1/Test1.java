package Les4.neww1;

public class Test1 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("Tom");
        Cat1 cat2 = new Cat1("Garfild");

        Dog1 dog1 = new Dog1("Bobik");
        Dog1 dog2 = new Dog1("Tobik");

        cat1.swim();
        cat1.run(200);
        System.out.println("_____________");
        cat2.swim();
        cat2.run(201);
        System.out.println("_____________");

        dog1.run(500);
        dog1.swim(10);
        System.out.println("_____________");
        dog2.run(501);
        dog2.swim(11);
        System.out.println("_____________");

        System.out.println(Cat1.getCount());
        System.out.println(Dog1.getCount());

        System.out.println(cat1.getName());
    }
}
