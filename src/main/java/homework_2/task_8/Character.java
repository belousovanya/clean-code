package homework_2.task_8;

public class Character {
    private String health;
    private String damage;
    private String armor;
    private String magicalAbility;

    private Character(CharacterBuilder characterBuilder) {
        this.health = characterBuilder.health;
        this.damage = characterBuilder.damage;
        this.armor = characterBuilder.armor;
        this.magicalAbility = characterBuilder.magicalAbility;
    }

    @Override
    public String toString() {
        return "Character{" +
                "health='" + health + '\'' +
                ", damage='" + damage + '\'' +
                ", armor='" + armor + '\'' +
                ", magicalAbility='" + magicalAbility + '\'' +
                '}';
    }

    static class CharacterBuilder {
        private String health;
        private String damage;
        private String armor;
        private String magicalAbility;

        public CharacterBuilder setHealth(String health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setDamage(String damage) {
            this.damage = damage;
            return this;
        }

        public CharacterBuilder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setMagicalAbility(String magicalAbility) {
            this.magicalAbility = magicalAbility;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
