public class Weapon {
    private String nameOfWeapon;
    private WeaponType type;

    public Weapon(String nameOfWeapon, WeaponType type) {
        this.nameOfWeapon = nameOfWeapon;
        this.type = type;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}
