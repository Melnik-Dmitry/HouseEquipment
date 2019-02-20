package by.epam.javawebtraining.melnik.task01.model.exception;

public class ConstructorInvalidParametrException extends Exception {

    public ConstructorInvalidParametrException() {
        super("The specified parameter is not valid");
    }
}
