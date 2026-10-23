package homework_2.task_4;

public class GunFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
}
