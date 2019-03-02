package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class FlatsNumberException extends ProgectException {

    public static final String FLAT_NUMBER = "Parameter flat number wasn't seted correctly";

    public FlatsNumberException() {
        super(FLAT_NUMBER);
    }
}
