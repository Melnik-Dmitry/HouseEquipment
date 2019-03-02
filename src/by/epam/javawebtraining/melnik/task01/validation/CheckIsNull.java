package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;

public interface CheckIsNull {

    boolean IsNull(Object link) throws NullLinkException;
}
