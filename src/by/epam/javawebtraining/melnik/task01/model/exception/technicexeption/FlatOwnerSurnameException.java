package by.epam.javawebtraining.melnik.task01.model.exception.technicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class FlatOwnerSurnameException extends ProjectException {

//    public static final String SURNAME = "Parameter surname is empty";

    public FlatOwnerSurnameException() {
        super();
    }

    public FlatOwnerSurnameException(String message) {
        super ( message );
    }

    public FlatOwnerSurnameException(Throwable cause) {
        super ( cause );
    }
}
