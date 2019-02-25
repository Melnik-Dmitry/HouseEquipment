package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;

public interface SearchParameterPower<T extends HouseEquipment> extends SearchParameter {

    T takeEquipmentWithMinPower(Building building) throws NullLinkException, EmptyListException;

    T takeEquipmentWithMaxPower(Building building) throws NullLinkException, EmptyListException;
}
