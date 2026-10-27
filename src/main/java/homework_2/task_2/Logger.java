package homework_2.task_2;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public void logError(String message) {
        System.out.println("ERROR: " + message);
    }

    public void logWarning(String message) {
        System.out.println("WARNING: " + message);
    }
}
