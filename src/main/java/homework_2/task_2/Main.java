package homework_2.task_2;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1 == logger2);

        logger1.logInfo("Успешное подключение к базе данных");
        logger2.logError("Ошибка при подключении к базе данных: Неверный логин");
        logger1.logWarning("Используется устаревший метод");

    }
}