package by.epam.javawebtraining.melnik.task01.util;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentCreatorOnWarehouse {

    private static List<HouseEquipment> createEquipmentList(int amountOfCreatedEquipment) {

        List<HouseEquipment> equipmentList = new ArrayList<>(amountOfCreatedEquipment);

        for (int i = 0; i < amountOfCreatedEquipment; i++) {
            HouseEquipmentType houseEquipmentType = RandomTypeOfHouseEquipment.makeHouseEquipmentType();
            HouseEquipment addedEquipment = CreatorHouseEquipment.createHouseEquipment(houseEquipmentType);
            equipmentList.add(addedEquipment);
        }
        return equipmentList;
    }

    public static void addEquipmentOnWarehose(ComercialBuilding warehouse, int amountOfEquipment)
            throws NullLinkException, MethodParameterException {

        new CheckParametrOfHouseEquipment().IsNull(warehouse);
        if (amountOfEquipment <= 0) {
            throw new MethodParameterException();
        }

        for (HouseEquipment he : createEquipmentList(amountOfEquipment)) {
            try {
                warehouse.getHouseEquipments().add(he);
            } catch (NullLinkException e) {
                e.printStackTrace();
            }
        }
    }
}
