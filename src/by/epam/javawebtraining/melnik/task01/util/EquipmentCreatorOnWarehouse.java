package by.epam.javawebtraining.melnik.task01.util;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentCreatorOnWarehouse {

    private static List<HouseEquipment> createEquipmentList(int amountOfCreatedEquipment)
            throws InvalidParameterException {

        if (amountOfCreatedEquipment <= 0) {
            throw new InvalidParameterException();
        }
        List<HouseEquipment> equipmentList = new ArrayList<>(amountOfCreatedEquipment);

        for (int i = 0; i < amountOfCreatedEquipment; i++) {
            HouseEquipmentType houseEquipmentType = RandomTypeOfHouseEquipment.makeHouseEquipmentType();
            HouseEquipment addedEquipment = CreatorHouseEquipment.createHouseEquipment(houseEquipmentType);
            equipmentList.add(addedEquipment);
        }
        return equipmentList;
    }

    public static void addEquipmentOnWarehose(Warehouse warehouse, int amountOfEquipment) throws InvalidParameterException {
        try {
            new CheckParametrOfHouseEquipment().IsNull(warehouse);
        } catch (NullLinkException nullLinkException) {
            nullLinkException.printStackTrace();
        }
        for (HouseEquipment he : createEquipmentList(amountOfEquipment)) {
            warehouse.getWarehouseStock().add(he);
        }
    }
}
