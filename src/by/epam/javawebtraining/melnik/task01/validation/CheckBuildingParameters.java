package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;

import java.util.Arrays;

public class CheckBuildingParameters implements CheckIsNull, CheckIsEmpty {

    @Override
    public boolean IsNull(Object link) throws InvalidParameterException {
        if (link == null) {
            try {
                throw new NullLinkException();
            } catch (NullLinkException e) {
                throw new InvalidParameterException(e);
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty(HouseEquipment[] equipments) throws EmptyListException {
        if (Arrays.asList(equipments).isEmpty()) {
            throw new EmptyListException();
        }
        return true;
    }
}
