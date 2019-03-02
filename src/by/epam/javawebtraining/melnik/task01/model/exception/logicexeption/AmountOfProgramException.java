package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class AmountOfProgramException extends ProgectException {

    public static final String AMOUNT_OF_PROGRAM  = "Parameter Inner volume wasn't seted correctly";

    public AmountOfProgramException() {
        super(AMOUNT_OF_PROGRAM);
    }
}
