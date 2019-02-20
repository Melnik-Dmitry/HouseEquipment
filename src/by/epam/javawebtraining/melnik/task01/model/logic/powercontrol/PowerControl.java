package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public interface PowerControl {

    double deemPowerConsumption(Flat flat) throws NullLink, EmptyList;

    double deemTotalPower(Flat flat) throws NullLink, EmptyList;
}
