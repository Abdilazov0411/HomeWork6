public class Skeleton extends Boss {

    public int counter;

    public Skeleton(int bossHealth, int bossDamage) {
        super(bossHealth, bossDamage);
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(counter);
    }
}

