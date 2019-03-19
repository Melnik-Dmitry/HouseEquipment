package by.epam.javawebtraining.melnik.task01.util.checkparameter;

import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;

public interface CheckIsNull {

    boolean IsNull(Object link) throws InvalidParameterException;
}
