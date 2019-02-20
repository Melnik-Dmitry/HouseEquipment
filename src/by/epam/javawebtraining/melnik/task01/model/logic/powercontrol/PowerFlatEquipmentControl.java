package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class PowerFlatEquipmentControl implements PowerControl {

    @Override
    public double deemPowerConsumption(Flat flat) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(flat);
//        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        double result = 0;
        for (HouseEquipment he : flat.getAllHouseEquipment()) {
            if (he.getIsTurningOn()) {
                result += he.getPowerConsumption();
            }
        }
        return result;
    }

    @Override
    public double deemTotalPower(Flat flat) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(flat);
//        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        double result = 0;
        for (HouseEquipment he : flat.getAllHouseEquipment()) {
            result += he.getPowerConsumption();
        }
        return result;
    }
}
