package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.FlatsNumberException;

public class FlatCreator {

    public static Flat createFlat() {
        return new Flat();
    }

    public static Flat createFlatWithParameters(int flatsNumber) throws FlatsNumberException {

        if (flatsNumber <= 0) {
            throw new FlatsNumberException();
        }
        return new Flat(flatsNumber);
    }
}
