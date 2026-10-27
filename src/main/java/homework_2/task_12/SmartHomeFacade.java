package homework_2.task_12;

public class SmartHomeFacade {
    private final Light light;
    private final Conditioner conditioner;
    private final SecuritySystem securitySystem;

    public SmartHomeFacade(Light light, Conditioner conditioner, SecuritySystem securitySystem) {
        this.light = light;
        this.conditioner = conditioner;
        this.securitySystem = securitySystem;
    }

    public void controlSmartHome(String action) {
        switch (action) {
            case "light_on" -> light.turnOn();
            case "light_off" -> light.turnOff();

            case "conditioner_on" -> conditioner.turnOn();
            case "conditioner_off" -> conditioner.turnOff();

            case "security_on" -> securitySystem.turnOn();
            case "security_off" -> securitySystem.turnOff();

            default -> System.out.println("Неизвестная команда");
        }
    }
}
