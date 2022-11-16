package Les6.HW;

import Les6.HW.Model.Obstacles.Car;
import Les6.HW.Model.Obstacles.Wall;
import Les6.HW.Model.Partecipanti.Cat;
import Les6.HW.Model.Partecipanti.Human;
import Les6.HW.Abstract.Obstacles;
import Les6.HW.Model.Obstacles.RunningTrack;
import Les6.HW.Abstract.Partecipanti;
import Les6.HW.Model.Partecipanti.Robot;
//Исп


public class Main {


    public static void main(String[] args) {
        Partecipanti[] participants = {
                new Human("Tolik", 200, 20),
                new Human("Vovik", 251, 25),
                new Robot("Walli",1000,20),
                new Human("Kolya", 400, 31),
                new Cat("Barsik", 200, 30),
        };
        Obstacles[] obstacles = {
                new Car(20),
                new RunningTrack(250),
                new Car(10),
                new Wall(25),
                new RunningTrack(300),
                new Wall(30)
        };

        for (Partecipanti p : participants) {
            for (Obstacles ov : obstacles) {
                if (!ov.overcome(p)) {
                    break;
                }

            }

        }

    }

}
