package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class FlatsNumberException extends ProjectException {

//    public static final String FLAT_NUMBER = "Parameter flat number wasn't seted correctly";

    public FlatsNumberException() {
        super();
    }

    public FlatsNumberException(String message) {
        super ( message );
    }
}
