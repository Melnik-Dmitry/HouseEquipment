package by.epam.javawebtraining.melnik.task01.model.validation;

import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;

import java.util.List;

public interface CheckListIsEmpty <T> {

    boolean isEmpty (List <T> list) throws EmptyList;
}
