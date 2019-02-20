package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;

public interface CheckIsNull {

    boolean IsNull (Object link) throws NullLink;
}
