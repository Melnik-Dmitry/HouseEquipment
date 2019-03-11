package by.epam.javawebtraining.melnik.task01.util.validation;

import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;

public interface CheckIsNull {

    boolean IsNull(Object link) throws InvalidParameterException;
}
