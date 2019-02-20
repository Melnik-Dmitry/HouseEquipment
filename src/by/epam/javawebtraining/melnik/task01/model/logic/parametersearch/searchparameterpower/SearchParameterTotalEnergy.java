package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.Collections;
import java.util.List;

public class SearchParameterTotalEnergy implements SearchParameterPower<HouseEquipment> {

    @Override
    public HouseEquipment takeEquipmentWithMinPower(Flat flat) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(flat);
        List<HouseEquipment> equipments = flat.getAllHouseEquipment();
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        return Collections.min(equipments, new EquipmentComparator());
    }

    @Override
    public HouseEquipment takeEquipmentWithMaxPower(Flat flat) throws NullLink, EmptyList {
        new CheckParametrOfHouseEquipment().IsNull(flat);
        List<HouseEquipment> equipments = flat.getAllHouseEquipment();
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        return Collections.max(equipments, new EquipmentComparator());
    }
}
