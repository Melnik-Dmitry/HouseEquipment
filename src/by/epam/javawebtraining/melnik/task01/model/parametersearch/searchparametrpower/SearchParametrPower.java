package by.epam.javawebtraining.melnik.task01.model.parametersearch.searchparametrpower;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.parametersearch.SearchParametr;

import java.util.List;

public interface SearchParametrPower <T extends HouseEquipment> extends SearchParametr {

    T takeEquipmentWithMinPower(List<T> equipments);

    T takeEquipmentWithMaxPower(List<T> equipments);
}
