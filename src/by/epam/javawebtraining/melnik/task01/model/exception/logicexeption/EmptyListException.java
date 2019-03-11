package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class EmptyListException extends ProgectException {

    public EmptyListException() {
        super ( "MyList doesn't have any objects" );
    }
}
