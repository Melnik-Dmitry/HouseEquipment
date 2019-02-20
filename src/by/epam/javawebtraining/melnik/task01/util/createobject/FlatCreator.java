package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.Flat;

public class FlatCreator {

    public static Flat createFlat() {
        return  new Flat();
    }

    public static Flat createFlatWithParameters (int flatsNumber, int totalNumberOfHouseEquipment){
        return  new Flat(flatsNumber, totalNumberOfHouseEquipment);
    }
}
