package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;

import java.util.Comparator;

public class SortHouseEquipment implements Sort {

    @Override
    public void sortSomething(ComercialBuilding comercialBuilding, Comparator comparator) {

        try {
            comercialBuilding.getHouseEquipments().sort(comparator);
        } catch (NullLinkException e) {
            e.printStackTrace();
        }
    }
}
