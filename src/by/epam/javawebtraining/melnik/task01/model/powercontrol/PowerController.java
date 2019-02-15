package by.epam.javawebtraining.melnik.task01.model.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public interface PowerController {

    double deemPowerConsumption(List<HouseEquipment> equipments);

    double deemTotalPower(List<HouseEquipment> equipments);
}
