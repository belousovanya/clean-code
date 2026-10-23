package homework_2.task_12;

public class SmartHomeFasade {
    private Ligth ligth;
    private Conditioner conditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFasade(Ligth ligth, Conditioner conditioner, SecuritySystem securitySystem) {
        this.ligth = ligth;
        this.conditioner = conditioner;
        this.securitySystem = securitySystem;
    }

    public void controlSmartHome(String action) {
        switch (action) {
            case "light_on" -> ligth.turnOn();
            case "light_off" -> ligth.turnOff();

            case "conditioner_on" -> conditioner.turnOn();
            case "conditioner_off" -> conditioner.turnOff();

            case "security_on" -> securitySystem.turnOn();
            case "security_off" -> securitySystem.turnOff();

            default -> System.out.println("Неизвестная команда");
        }
    }
}
