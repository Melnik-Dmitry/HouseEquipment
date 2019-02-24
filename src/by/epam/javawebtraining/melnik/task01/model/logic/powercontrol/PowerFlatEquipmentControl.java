package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class PowerFlatEquipmentControl implements PowerControl {

    @Override
    public double deemPowerConsumption(Flat flat) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment().IsNull(flat);
        new CheckParametrOfHouseEquipment().isEmpty(flat.getAllHouseEquipment());

        double result = 0;
        for (HouseEquipment he : flat.getAllHouseEquipment()) {
            if (he.getIsTurningOn()) {
                result += he.getPowerConsumption();
            }
        }
        return result;
    }

    @Override
    public double deemTotalPower(Flat flat) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment().IsNull(flat);
        new CheckParametrOfHouseEquipment().isEmpty(flat.getAllHouseEquipment());

        double result = 0;
        for (HouseEquipment he : flat.getAllHouseEquipment()) {
            result += he.getTotalPower();
        }
        return result;
    }
}
