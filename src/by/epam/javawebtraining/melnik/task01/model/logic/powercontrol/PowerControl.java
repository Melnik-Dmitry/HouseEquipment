package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;

public interface PowerControl {

    double deemPowerConsumption(Building building) throws NullLinkException, EmptyListException;

    double deemTotalPower(Building building) throws NullLinkException, EmptyListException;
}
