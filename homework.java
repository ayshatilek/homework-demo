public class homework {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(LogLevel.ERROR, "File not found");
        logger.log(LogLevel.WARNING, "Low disk space");
        logger.log(LogLevel.INFO, "Application started");

        int[] numbers = { -3, 5, 0, 7, -1, 2 };
        NumberProcessor.printPositiveNumbers(numbers);

        System.out.println("Division result: " + MathUtils.divide(10, 2));
        System.out.println("Division result: " + MathUtils.divide(10, 0));

        User user = new User("Aisha", "aisha@mail.com");
        user.save();

        FileReader fileReader = new FileReader();
        System.out.println(fileReader.readFile("data.txt"));

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport();
    }
}

enum LogLevel {
    ERROR, WARNING, INFO
}

class Logger {
    public void log(LogLevel level, String message) {
        System.out.println(level + ": " + message);
    }
}

class AppConfig {
    public static final String CONNECTION_STRING =
            "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}

class DatabaseService {
    public void connect() {
        System.out.println("Connecting using: " + AppConfig.CONNECTION_STRING);
    }
}

class LoggingService {
    public void logToDatabase(String message) {
        System.out.println("Logging to DB using: " + AppConfig.CONNECTION_STRING);
    }
}

class NumberProcessor {

    public static void printPositiveNumbers(int[] numbers) {
        if (numbers == null) return;

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }
}

class MathUtils {

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void save() {
        System.out.println("User saved: " + name + ", " + email);
    }
}

class FileReader {

    public String readFile(String filePath) {
        return "File content from: " + filePath;
    }
}

class ReportGenerator {

    public void generateReport() {
        System.out.println("Basic report generated");
    }
}

