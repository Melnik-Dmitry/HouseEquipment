package by.epam.javawebtraining.melnik.task01.model.exception;

public class ProjectException extends Exception {

    public ProjectException() {
    }

    public ProjectException(String message) {
        super(message);
    }

    public ProjectException(Throwable cause) {
        super(cause);
    }
}
