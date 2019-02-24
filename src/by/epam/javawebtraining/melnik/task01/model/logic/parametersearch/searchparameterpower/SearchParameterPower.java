package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;

public interface SearchParameterPower <T extends HouseEquipment> extends SearchParameter {

  T takeEquipmentWithMinPower(Flat flat) throws NullLinkException, EmptyListException;

  T takeEquipmentWithMaxPower(Flat flat) throws NullLinkException, EmptyListException;
}
