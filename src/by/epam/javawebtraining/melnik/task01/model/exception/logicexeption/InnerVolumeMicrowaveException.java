package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class InnerVolumeMicrowaveException extends ProjectException {

//    public static final String INNER_VOLUME = "Parameter Inner volume wasn't seted correctly";

    public InnerVolumeMicrowaveException() {
        super();
    }

    public InnerVolumeMicrowaveException(String message) {
        super ( message );
    }
}
