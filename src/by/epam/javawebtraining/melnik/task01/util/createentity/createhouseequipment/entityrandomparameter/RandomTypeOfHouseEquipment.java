package by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;

import java.util.Random;

public class RandomTypeOfHouseEquipment {

    public static HouseEquipmentType makeValueParameter() {

        switch (new Random().nextInt(3)) {
            case 0:
                return HouseEquipmentType.MICROWAWE;
            case 1:
                return HouseEquipmentType.MULTICOOKER;
            default:
                return HouseEquipmentType.TOAST;
        }
    }
}
