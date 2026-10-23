package homework_2.task_4;

public class SwordFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
