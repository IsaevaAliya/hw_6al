public class Boss extends GameEntity {
    public Weapon weapon;

    public Boss(String name, int damage, int health,Weapon weapon) {
        super(name, damage, health);
        this.weapon=weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "name :" + getName() + "health" + getHealth() + "damage:" + getDamage()+
                "weapon type:" + weapon.getWeaponType()+"weapon name " + weapon.getWeaponName();
    }
}