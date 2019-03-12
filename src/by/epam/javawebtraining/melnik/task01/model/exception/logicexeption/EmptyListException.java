package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class EmptyListException extends ProjectException {

    //"MyList doesn't have any objects"

    public EmptyListException() {
        super ();
    }

    public EmptyListException(String message) {
        super ( message );
    }
}
