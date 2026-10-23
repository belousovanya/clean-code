package homework_2.task_8;

public class Game {
    public static void main(String[] args) {
        Character mainCharacter = new Character.CharacterBuilder()
                .setHealth("Максимальное")
                .setDamage("Максимальный")
                .setArmor("Суперзащита")
                .setMagicalAbility("Неуязвимость")
                .build();

        Character npcCharacter = new Character.CharacterBuilder()
                .setHealth("Среднее")
                .setDamage("Слабый")
                .setArmor("Доспехи")
                .setMagicalAbility("Отсутствуют")
                .build();

        System.out.println(mainCharacter);
        System.out.println(npcCharacter);
    }
}