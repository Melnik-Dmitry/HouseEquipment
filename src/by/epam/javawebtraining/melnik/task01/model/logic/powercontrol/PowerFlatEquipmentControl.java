package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class PowerFlatEquipmentControl implements PowerControl {

    @Override
    public double deemPowerConsumption(ComercialBuilding comercialBuilding)
            throws NullLinkException, EmptyListException {

        new CheckParametrOfHouseEquipment().IsNull(comercialBuilding);
        new CheckParametrOfHouseEquipment().isEmpty(comercialBuilding.getHouseEquipments());

        double result = 0;
        for (HouseEquipment he : comercialBuilding.getHouseEquipments()) {
            if (he.getIsTurningOn()) {
                result += he.getPowerConsumption();
            }
        }
        return result;
    }

    @Override
    public double deemTotalPower(ComercialBuilding comercialBuilding)
            throws NullLinkException, EmptyListException {

        new CheckParametrOfHouseEquipment().IsNull(comercialBuilding);
        new CheckParametrOfHouseEquipment().isEmpty(comercialBuilding.getHouseEquipments());

        double result = 0;
        for (HouseEquipment he : comercialBuilding.getHouseEquipments()) {
            result += he.getTotalPower();
        }
        return result;
    }
}
