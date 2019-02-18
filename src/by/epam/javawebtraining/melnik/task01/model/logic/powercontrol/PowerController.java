package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public interface PowerController {

    double deemPowerConsumption(List<HouseEquipment> equipments) throws NullLink, EmptyList;

    double deemTotalPower(List<HouseEquipment> equipments) throws NullLink, EmptyList;
}
