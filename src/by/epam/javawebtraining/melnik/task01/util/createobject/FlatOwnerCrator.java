package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;

public class FlatOwnerCrator {

    public static FlatOwner createFlatOwner(){
        return new FlatOwner();
    }

    public static FlatOwner createFlatOwnerWithParameters(String surname, Flat flat){
        return  new FlatOwner(surname, flat);
    }
}
