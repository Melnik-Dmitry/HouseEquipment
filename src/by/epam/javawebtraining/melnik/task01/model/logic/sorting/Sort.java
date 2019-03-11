package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;

import java.util.Comparator;

public interface Sort {

  void increasingSort(Building building) throws InvalidParameterException;

  void descendingSort (Building building) throws InvalidParameterException;
}
