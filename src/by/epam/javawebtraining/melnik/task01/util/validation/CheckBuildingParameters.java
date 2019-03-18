package by.epam.javawebtraining.melnik.task01.util.validation;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;

import java.util.Arrays;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class CheckBuildingParameters implements CheckIsNull, CheckIsEmpty {

    @Override
    public boolean IsNull(Object link) throws InvalidParameterException {
        if (link == null) {
            try {
                appLogger.error("Link is null.");
                throw new NullLinkException();
            } catch (NullLinkException e) {
                throw new InvalidParameterException(e);
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty(HouseEquipment[] equipments) throws EmptyListException {
        if (Arrays.asList(equipments).isEmpty()) {
            appLogger.error("Array is empty.");
            throw new EmptyListException();
        }
        return true;
    }
}
