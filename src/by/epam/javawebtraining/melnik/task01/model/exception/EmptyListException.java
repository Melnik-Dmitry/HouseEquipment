package by.epam.javawebtraining.melnik.task01.model.exception;

public class EmptyListException extends Exception {

    public EmptyListException() {
        super ( "List doesn't have any objects" );
    }
}
