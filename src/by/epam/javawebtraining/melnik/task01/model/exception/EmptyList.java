package by.epam.javawebtraining.melnik.task01.model.exception;

public class EmptyList extends Exception {

    public EmptyList() {
        super("List doesn't have any objects");
    }
}
