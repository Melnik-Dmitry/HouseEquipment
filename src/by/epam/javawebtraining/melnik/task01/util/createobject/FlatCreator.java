package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;

public class FlatCreator {

    public static Flat createFlat() {
        return new Flat ();
    }

    public static Flat createFlatWithParameters(int flatsNumber) {
        return new Flat ( flatsNumber );
    }
}
