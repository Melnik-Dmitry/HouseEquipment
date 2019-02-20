package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;

import java.util.List;

public interface SearchParameterPower <T extends HouseEquipment> extends SearchParameter { //  List<T> equipments

  T takeEquipmentWithMinPower(Flat flat) throws NullLink, EmptyList;

  T takeEquipmentWithMaxPower(Flat flat) throws NullLink, EmptyList;
}
