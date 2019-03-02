package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class FlatOwnerCreator {

    public static FlatOwner createFlatOwner() {
        return new FlatOwner();
    }

    public static FlatOwner createFlatOwnerWithParameters(String surname, ComercialBuilding flat)
            throws NullLinkException, FlatOwnerSurnameException {

        if (surname.isEmpty()) {
            throw new FlatOwnerSurnameException();
        } else if (surname == null) {
            throw new NullLinkException();
        }
        new CheckParametrOfHouseEquipment().IsNull(flat);
        return new FlatOwner(surname, flat);
    }
}
