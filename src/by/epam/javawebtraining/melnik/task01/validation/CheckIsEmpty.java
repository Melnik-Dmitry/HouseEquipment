package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;

import java.util.List;

public interface CheckIsEmpty<T> {

    boolean isEmpty(List<T> list) throws EmptyListException;
}
