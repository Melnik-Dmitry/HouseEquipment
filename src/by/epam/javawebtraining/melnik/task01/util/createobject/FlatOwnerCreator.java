package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;

public class FlatOwnerCreator {

    public static FlatOwner createFlatOwner(){
        return new FlatOwner();
    }

    public static FlatOwner createFlatOwnerWithParameters(String surname, Flat flat){
        return  new FlatOwner(surname, flat);
    }
}
