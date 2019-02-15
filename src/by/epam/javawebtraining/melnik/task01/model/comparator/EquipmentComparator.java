package by.epam.javawebtraining.melnik.task01.model.comparator;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.Comparator;

public class EquipmentComparator implements Comparator <HouseEquipment> {

    @Override
    public int compare(HouseEquipment firstHE, HouseEquipment secondHE) {
        if (firstHE.getTotalPower() == secondHE.getTotalPower()) {
            return 0;
        } else if (firstHE.getTotalPower() > secondHE.getTotalPower()) {
            return 1;
        }
        return -1;
    }
}
