package homework_2.task_1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();

        System.out.println(configurationManager1 == configurationManager2); // обе переменные ссылаются на один объект

        configurationManager1.setDbUrl("localhost:5432");
        configurationManager1.setFilePath("/app/files");
        configurationManager1.setLogLevel("INFO");

        System.out.println(configurationManager1.getDbUrl());
        System.out.println(configurationManager1.getFilePath());
        System.out.println(configurationManager1.getLogLevel());

        System.out.println(configurationManager2.getDbUrl());
    }
}