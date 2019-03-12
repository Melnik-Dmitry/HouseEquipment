package by.epam.javawebtraining.melnik.task01.model.exception.technicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class InvalidParameterException extends ProjectException {

//    "The specified parameter is not valid"

    public InvalidParameterException() {
        super ( );
    }

    public InvalidParameterException(String message) {
        super ( message );
    }

    public InvalidParameterException(NullLinkException cause) {
        super(cause);
    }
}
