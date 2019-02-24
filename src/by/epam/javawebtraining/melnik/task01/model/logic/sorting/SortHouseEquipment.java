package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;

import java.util.Comparator;

public class SortHouseEquipment implements Sort {

    @Override
    public void sortSomething(Building building, Comparator comparator) {

        building.getAllHouseEquipment().sort(comparator);
    }
}
