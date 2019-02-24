package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;

public interface CheckIsNull {

    boolean IsNull (Object link) throws NullLinkException;
}
