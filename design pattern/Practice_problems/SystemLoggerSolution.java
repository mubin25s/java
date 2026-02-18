
// Singleton Logger Class
class SystemLogger {
    private static SystemLogger instance;
    private StringBuilder logs;

    // Private constructor to prevent direct instantiation
    private SystemLogger() {
        logs = new StringBuilder();
        System.out.println("System Logger initialized.");
    }

    // Public method to provide global access to the instance
    public static synchronized SystemLogger getInstance() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        logs.append(message).append("\n");
        System.out.println("LOG: " + message);
    }

    // Method to simulate retrieving logs
    public String getLogs() {
        return logs.toString();
    }
}

// Module 1 using the logger
class CourseManagementModule {
    public void createCourse(String courseName) {
        System.out.println("Processing Course Creation...");
        SystemLogger logger = SystemLogger.getInstance();
        logger.log("Course '"+ courseName +"' created by CourseManagementModule.");
    }
}

// Module 2 using the logger
class OnlineExamModule {
    public void startExam(String examName) {
        System.out.println("Starting Exam...");
        SystemLogger logger = SystemLogger.getInstance();
        logger.log("Exam '"+ examName +"' started by OnlineExamModule.");
    }
}

// Main class to demonstrate Singleton Usage
public class SystemLoggerSolution {
    public static void main(String[] args) {
        System.out.println("--- System Logger Test ---");

        // Simulate Course Management activity
        CourseManagementModule courseModule = new CourseManagementModule();
        courseModule.createCourse("Design Patterns 101");

        // Simulate Online Exam activity
        OnlineExamModule examModule = new OnlineExamModule();
        examModule.startExam("Midterm Exam");

        // Verify that same instance is used
        SystemLogger loggerInternalRef = SystemLogger.getInstance();
        System.out.println("\n--- Log Verification ---");
        System.out.println(loggerInternalRef.getLogs());

        // Check instance equality just to be sure
        SystemLogger log1 = SystemLogger.getInstance();
        SystemLogger log2 = SystemLogger.getInstance();
        if(log1 == log2) {
             System.out.println("SUCCESS: Both modules used the same SystemLogger instance.");
        } else {
             System.out.println("FAILURE: Different instances were created.");
        }
    }
}
