package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;

public interface SearchParameterPower<T extends HouseEquipment> extends SearchParameter {

    T takeEquipmentWithMinPower(ComercialBuilding comercialBuilding) throws NullLinkException, EmptyListException;

    T takeEquipmentWithMaxPower(ComercialBuilding comercialBuilding) throws NullLinkException, EmptyListException;
}
