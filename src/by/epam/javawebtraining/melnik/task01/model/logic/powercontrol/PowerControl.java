package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;

public interface PowerControl {

    double deemPowerConsumption(ComercialBuilding comercialBuilding) throws NullLinkException, EmptyListException;

    double deemTotalPower(ComercialBuilding comercialBuilding) throws NullLinkException, EmptyListException;
}
