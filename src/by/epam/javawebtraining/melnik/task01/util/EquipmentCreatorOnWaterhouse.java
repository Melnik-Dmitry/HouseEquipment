package by.epam.javawebtraining.melnik.task01.util;

import by.epam.javawebtraining.melnik.task01.model.entity.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentCreatorOnWaterhouse {

    private static List<HouseEquipment> createEquipmentList(int amountOfCreatedEquipment)
            throws InvalidParameterException {

        if (amountOfCreatedEquipment <= 0) {
            throw new InvalidParameterException();
        }
        List<HouseEquipment> equipmentList = new ArrayList<>(amountOfCreatedEquipment);

        for (int i = 0; i < amountOfCreatedEquipment; i++) {
            HouseEquipmentType houseEquipmentType = RandomTypeOfHouseEquipment.makeValueParameter();
            HouseEquipment addedEquipment = CreatorHouseEquipment.createHouseEquipment(houseEquipmentType);
            equipmentList.add(addedEquipment);
        }
        return equipmentList;
    }

    public static void addEquipmentOnWarehose(Warehouse warehouse) throws InvalidParameterException {
        try {
            new CheckParametrOfHouseEquipment().IsNull(warehouse);
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }
        for (HouseEquipment he : createEquipmentList(6)) {
            warehouse.getWarehouseStock().add(he);
        }
    }
}
