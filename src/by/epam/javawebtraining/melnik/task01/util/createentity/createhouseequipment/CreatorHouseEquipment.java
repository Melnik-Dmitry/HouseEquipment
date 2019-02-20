package by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.*;
import by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter.RandomAmountOfProgram;
import by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter.RandomInnerVolume;
import by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter.RandomTotalPower;

public class CreatorHouseEquipment {

    public static HouseEquipment createHouseEquipment(HouseEquipmentType houseEquipmentType) {

        double totalPower = new RandomTotalPower().makeValueParameter();
        double powerConsumption = 0.7 * totalPower;
        int amountOfprogram = new RandomAmountOfProgram().makeValueParameter();
        int innerVolume = new RandomInnerVolume().makeValueParameter();

        switch (houseEquipmentType) {
            case MICROWAWE:
                return new Microwave(totalPower, powerConsumption, innerVolume);
            case MULTICOOKER:
                return new Multicooker(totalPower, powerConsumption, amountOfprogram);
            case TOAST:
                return new Toast(totalPower, powerConsumption, false);
            default:
                return new HouseEquipment();
        }
    }
}
