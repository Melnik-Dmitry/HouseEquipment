package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.Collections;
import java.util.List;

public class SearchParameterTotalEnergy implements SearchParameterPower<HouseEquipment> {

    @Override
    public HouseEquipment takeEquipmentWithMinPower(List <HouseEquipment> equipments) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(equipments);
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        return Collections.min(equipments, new EquipmentComparator());
    }

    @Override
    public HouseEquipment takeEquipmentWithMaxPower(List<HouseEquipment> equipments) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(equipments);
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

       return Collections.max(equipments, new EquipmentComparator());
    }
}
