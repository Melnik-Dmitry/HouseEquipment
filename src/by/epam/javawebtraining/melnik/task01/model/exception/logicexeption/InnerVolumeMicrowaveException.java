package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class InnerVolumeMicrowaveException extends ProgectException {

    public static final String INNER_VOLUME = "Parameter Inner volume wasn't seted correctly";

    public InnerVolumeMicrowaveException() {
        super(INNER_VOLUME);
    }
}
