public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Cat("Murzik", 50,3),
                new Robot("Ultron", 1000, 20),
                new Human("Tony Stark", 500, 2)
        };

        Obstacle[] obstacles = {
                new Wall(5),
                new Treadmill(500),
        };

        for (Competitor c: competitors) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(c);
                if(!c.atDistance()){
                    break;
                }
            }

        }

    }
}