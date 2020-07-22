public class Cat implements Competitor {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean atDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.atDistance = true;
    }

    @Override
    public void run(int dist) {
        if(maxRunDistance == 0){
            System.out.println(name + " не бегает");
            atDistance = false;
            return;
        }
        if(dist <= maxRunDistance){
            System.out.println(name + " успешно пробежала забег");
        } else {
            System.out.println(name + " не может столько пробежать");
            atDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(maxJumpHeight == 0){
            System.out.println(name + " не умеет прыгать");
            atDistance = false;
            return;
        }
        if(height <= maxJumpHeight){
            System.out.println(name + " успешно перепрыгнул стену");
        } else {
            System.out.println(name + " не может перепрыгнуть");
            atDistance = false;
        }
    }

    @Override
    public boolean atDistance() {
        return atDistance;
    }
}
