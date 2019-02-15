package by.epam.javawebtraining.melnik.task01.model.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.validation.checllink.CheckLinkREnamed;

import java.util.List;

public class PowerFlatEquipmentController implements PowerController {

    public double deemPowerConsumption(List<HouseEquipment> equipments) {
        new CheckLinkREnamed().checkIsEmpty(equipments);
        new CheckLinkREnamed().checkIsNull(equipments);

        double result = 0;
        for (HouseEquipment he : equipments) {
            if (he.getIsTurningOn()) {
                result += he.getPowerConsumption();
            }
        }
        return result;
    }

    public double deemTotalPower(List<HouseEquipment> equipments) {
        new CheckLinkREnamed().checkIsEmpty(equipments);
        new CheckLinkREnamed().checkIsNull(equipments);

        double result = 0;
        for (HouseEquipment he : equipments) {
            result += he.getPowerConsumption();

        }
        return result;
    }
}
