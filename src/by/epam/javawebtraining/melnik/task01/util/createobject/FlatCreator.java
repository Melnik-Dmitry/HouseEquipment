package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;

public class FlatCreator {

    public static Flat createFlat() {
        return new Flat ();
    }

    public static Flat createFlatWithParameters(int flatsNumber) throws InvalidParameterException {
        if (flatsNumber <= 0) {
            throw new InvalidParameterException ();
        }
        return new Flat ( flatsNumber );
    }
}
