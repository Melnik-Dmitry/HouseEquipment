package by.epam.javawebtraining.melnik.task01.model.exception.technicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class InvalidParameterException extends ProgectException {

    public InvalidParameterException() {
        super ( "The specified parameter is not valid" );
    }

    public InvalidParameterException(NullLinkException cause) {
        super(cause);
    }
}
