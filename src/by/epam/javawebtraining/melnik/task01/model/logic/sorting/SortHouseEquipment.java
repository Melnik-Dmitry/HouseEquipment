package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.checkparameter.CheckBuildingParameters;

public class SortHouseEquipment implements Sort {

    @Override
    public void increasingSort(Building building) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(building);

        HouseEquipment[] equipments = building.getEquipments();

        for (int i = 0; i < equipments.length - 1; i++) {

            HouseEquipment min = equipments[i];
            int index = i;
            for (int j = i + 1; j < equipments.length; j++) {

                if (equipments[j].getTotalPower() < min.getTotalPower()) {
                    min = equipments[j];
                    index = j;
                }
            }
            if (i != index) {
                HouseEquipment temp = equipments[i];
                equipments[i] = min;
                equipments[index] = temp;
            }
        }

        try {
            building.setEquipments(equipments);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void descendingSort(Building building) throws InvalidParameterException {
        new CheckBuildingParameters().IsNull(building);

        HouseEquipment[] equipments = building.getEquipments();

        for (int i = 0; i < equipments.length - 1; i++) {

            HouseEquipment min = equipments[i];
            int index = i;
            for (int j = i + 1; j < equipments.length; j++) {
                if (equipments[j].getTotalPower() > min.getTotalPower()) {
                    min = equipments[j];
                    index = j;
                }
            }
            if (i != index) {
                HouseEquipment temp = equipments[i];
                equipments[i] = min;
                equipments[index] = temp;
            }
        }

        try {
            building.setEquipments(equipments);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }
}
