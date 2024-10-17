public class Boss extends GameEntity{
    private Weapon weapon;


    public Boss(int bossHealth, int bossDamage) {
        super(bossHealth, bossDamage);
        this.weapon = weapon;


    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo(){
        System.out.println("Boss health: " + getBossHealth());
        System.out.println("Boss damage: " + getBossDamage());

        System.out.println("Boss shoots with " + this.weapon + " weapon");

    }
}
