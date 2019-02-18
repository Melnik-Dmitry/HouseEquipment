package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.exception.EmptyList;

import java.util.List;

public interface CheckListIsEmpty <T> {

    boolean isEmpty (List <T> list) throws EmptyList;
}
