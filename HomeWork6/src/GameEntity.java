public class GameEntity {
    private int bossHealth;
    private int bossDamage;
    private int heroesHealth;
    private int heroesDamage;

    public GameEntity(int bossHealth, int bossDamage) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
    }

    public GameEntity(int heroesHealth) {
        this.bossHealth = bossHealth;
    }
    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }
}
