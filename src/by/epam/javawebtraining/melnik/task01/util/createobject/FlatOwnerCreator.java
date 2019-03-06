package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.validation.CheckBuildingParameters;

public class FlatOwnerCreator {

    public static FlatOwner createFlatOwner() {
        return new FlatOwner();
    }

    public static FlatOwner createFlatOwnerWithParameters(String surname, Flat flat)
            throws FlatOwnerSurnameException, InvalidParameterException {

        if (surname.isEmpty()) {
            throw new FlatOwnerSurnameException();
        }

        new CheckBuildingParameters().IsNull(surname);
        new CheckBuildingParameters().IsNull(flat);

        return new FlatOwner(surname, flat);
    }
}
