import java.util.Date;

public class Logger {
    // Log levels
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;

    // Method to log messages
    public static void log(int level, String message) {
        String formattedMessage = "[" + new Date() + "] ";
        switch (level) {
            case INFO:
                formattedMessage += "[INFO] ";
                break;
            case WARNING:
                formattedMessage += "[WARNING] ";
                break;
            case ERROR:
                formattedMessage += "[ERROR] ";
                break;
            default:
                formattedMessage += "[UNKNOWN] ";
        }
        formattedMessage += message;
        System.out.println(formattedMessage);
    }
}
