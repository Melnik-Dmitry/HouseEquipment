package by.epam.javawebtraining.melnik.task01.model.exception.technicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class FlatOwnerSurnameException extends ProgectException {

    public static final String SURNAME = "Parameter surname is empty";

    public FlatOwnerSurnameException() {
        super(SURNAME);
    }
}
