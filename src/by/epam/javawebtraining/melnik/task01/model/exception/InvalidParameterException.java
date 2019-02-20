package by.epam.javawebtraining.melnik.task01.model.exception;

public class InvalidParameterException extends Exception {

    public InvalidParameterException() {
        super("The specified parameter is not valid");
    }
}
