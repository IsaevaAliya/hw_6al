public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.AK_47, "AK47");
        Boss boss = new Boss("Adi", 200, 50, weapon);

        System.out.println("Boss Name" + boss.getName());
        System.out.println("boss health " + boss.getHealth());
        System.out.println("boss damage" + boss.getDamage());
        System.out.println("boss weapon type" + weapon.getWeaponType());
        System.out.println("boss weapon name " + weapon.getWeaponName());
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton("Skeleton1 ", 300, 60, new Weapon(WeaponType.KNIFE,
                "knife"), 150);
        Skeleton skeleton = new Skeleton("Skeleton2", 500, 70, new Weapon(WeaponType.LASER
                , "laser"), 120);

        System.out.println("Skeleton1" + skeleton1.printInfo());
        System.out.println("Skeleton2" + skeleton.printInfo());
    }
}