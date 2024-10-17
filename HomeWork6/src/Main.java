public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon("AK-47", WeaponType.WATER_WEAPON);
        Boss boss = new Boss(700,50);
        boss.printInfo();

    }
}