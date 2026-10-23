package homework_2.task_12;

public class Main {
    public static void main(String[] args) {
        Ligth ligth = new Ligth();
        Conditioner conditioner = new Conditioner();
        SecuritySystem securitySystem = new SecuritySystem();

        SmartHomeFasade smartHome = new SmartHomeFasade(ligth, conditioner, securitySystem);

        smartHome.controlSmartHome("light_on");
        smartHome.controlSmartHome("conditioner_on");
        smartHome.controlSmartHome("security_off");
    }
}
