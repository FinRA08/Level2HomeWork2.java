package level2.homeworc1;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        System.out.println();
        Human human = new Human("Вася");
        human.jump();
        human.run();
        Cat cat = new Cat("Мурзик");
        System.out.println();
        cat.jump();
        cat.run();
        Robot robot = new Robot("С300");
        System.out.println();
        robot.jump();
        robot.run();
        System.out.println();
        Human human1 = new Human("Тимофей", 5, 7);
        human1.jumpOverTheWall();
        Cat cat1 = new Cat("Тимка", 11, 4);
        System.out.println();
        cat1.jumpOverTheWall();
        System.out.println();
        Robot robot1 = new Robot("C400", 500, 500);
        robot1.jumpOverTheWall();
        System.out.println();
        human1.joggingOnTheTrack();
        cat1.joggingOnTheTrack();
        robot1.joggingOnTheTrack();

        Running[] participants = {human1, cat1, robot1};
        int[] obstacles = {Wall.h, Treadmill.s};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++){
                System.out.println(participants[1]);

            }
        }

    }
}
