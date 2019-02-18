package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;

import java.util.List;

public interface SearchParameterPower<T extends HouseEquipment> extends SearchParameter {

    T takeEquipmentWithMinPower(List<T> equipments) throws NullLink, EmptyList;

    T takeEquipmentWithMaxPower(List<T> equipments) throws NullLink, EmptyList;
}
