package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;

public class FlatOwnerCreator {

    public static FlatOwner createFlatOwner() {
        return new FlatOwner ();
    }

    public static FlatOwner createFlatOwnerWithParameters(String surname, Building flat)
            throws NullLinkException {
        return new FlatOwner ( surname, flat );
    }
}
