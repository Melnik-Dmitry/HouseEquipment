package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;

public interface PowerControl {

    double deemPowerConsumption(Flat flat) throws NullLinkException, EmptyListException;

    double deemTotalPower(Flat flat) throws NullLinkException, EmptyListException;
}
