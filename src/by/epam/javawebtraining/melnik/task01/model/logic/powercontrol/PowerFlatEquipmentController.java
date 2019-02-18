package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.List;

public class PowerFlatEquipmentController implements PowerController {

    public double deemPowerConsumption(List<HouseEquipment> equipments) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(equipments);
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        double result = 0;
        for (HouseEquipment he : equipments) {
            if (he.getIsTurningOn()) {
                result += he.getPowerConsumption();
            }
        }
        return result;
    }

    public double deemTotalPower(List<HouseEquipment> equipments) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(equipments);
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        double result = 0;
        for (HouseEquipment he : equipments) {
            result += he.getPowerConsumption();

        }
        return result;
    }
}
