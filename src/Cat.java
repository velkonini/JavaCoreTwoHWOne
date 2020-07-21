public class Cat {
   String name;
   int runDist;
   int jumpHeight;

    public Cat(String name, int runDist, int jumpHeight) {
        this.name = name;
        this.runDist = runDist;
        this.jumpHeight = jumpHeight;
    }

    void info(){
        System.out.println(name +" " + runDist + " " + jumpHeight );
    }
}
