package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class FlatOwnerCreator {

    public static FlatOwner createFlatOwner() {
        return new FlatOwner ();
    }

    public static FlatOwner createFlatOwnerWithParameters(String surname, ComercialBuilding flat)
            throws NullLinkException {
        new CheckParametrOfHouseEquipment ().IsNull ( flat );
        return new FlatOwner ( surname, flat );
    }
}
