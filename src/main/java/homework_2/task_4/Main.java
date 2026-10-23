package homework_2.task_4;

public class Main {
    public static void main(String[] args) {
        WeaponFactory bowFactory = new BowFactory();
        WeaponFactory swordFactory = new SwordFactory();
        WeaponFactory gunFactory = new GunFactory();

        Weapon bow = bowFactory.createWeapon();
        Weapon sword = swordFactory.createWeapon();
        Weapon gun = gunFactory.createWeapon();

        bow.attack();
        sword.attack();
        gun.attack();

        System.out.println(bow instanceof Bow);
        System.out.println(sword instanceof Sword);
        System.out.println(gun instanceof Gun);
    }
}