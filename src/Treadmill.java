public class Treadmill implements Obstacle{
        int dist;

        public Treadmill(int dist) {
            this.dist = dist;
        }

        @Override
        public void doIt(Competitor c) {
            c.run(dist);
        }
    }


