package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class MethodParameterException extends ProgectException {

    public MethodParameterException() {
        super("Method parameter isn't valid");
    }
}
