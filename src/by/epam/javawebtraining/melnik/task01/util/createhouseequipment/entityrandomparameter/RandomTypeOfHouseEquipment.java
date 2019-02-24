package by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;

import java.util.Random;

public class RandomTypeOfHouseEquipment {

    public static HouseEquipmentType makeHouseEquipmentType() {

        switch (new Random().nextInt(HouseEquipmentType.values().length)) {
            case 0:
                return HouseEquipmentType.MICROWAWE;
            case 1:
                return HouseEquipmentType.MULTICOOKER;
            default:
                return HouseEquipmentType.TOAST;
        }
    }
}
