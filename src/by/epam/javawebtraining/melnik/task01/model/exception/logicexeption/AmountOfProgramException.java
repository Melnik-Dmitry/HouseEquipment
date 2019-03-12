package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class AmountOfProgramException extends ProjectException {

    public static final String AMOUNT_OF_PROGRAM  = "Parameter Inner volume wasn't seted correctly";

    public AmountOfProgramException() {
        super();
    }

    public AmountOfProgramException(String message) {
        super ( message );
    }
}
