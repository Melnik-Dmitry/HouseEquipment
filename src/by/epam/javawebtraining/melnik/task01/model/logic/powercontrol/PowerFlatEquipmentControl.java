package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class PowerFlatEquipmentControl implements PowerControl {

    @Override
    public double deemPowerConsumption(Building building) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment ().IsNull ( building );
        new CheckParametrOfHouseEquipment ().isEmpty ( building.getHouseEquipments () );

        double result = 0;
        for (HouseEquipment he : building.getHouseEquipments ()) {
            if (he.getIsTurningOn ()) {
                result += he.getPowerConsumption ();
            }
        }
        return result;
    }

    @Override
    public double deemTotalPower(Building building) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment ().IsNull ( building );
        new CheckParametrOfHouseEquipment ().isEmpty ( building.getHouseEquipments () );

        double result = 0;
        for (HouseEquipment he : building.getHouseEquipments ()) {
            result += he.getTotalPower ();
        }
        return result;
    }
}
