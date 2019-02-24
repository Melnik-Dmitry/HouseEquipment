package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.Collections;
import java.util.List;

public class SearchParameterPowerConsumption implements SearchParameterPower<HouseEquipment> {

    @Override
    public HouseEquipment takeEquipmentWithMinPower(Flat flat) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment().IsNull(flat);
        List<HouseEquipment> equipments = flat.getAllHouseEquipment();
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        return Collections.min(equipments, new EquipmentComparator());
    }

    @Override
    public HouseEquipment takeEquipmentWithMaxPower(Flat flat) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment().IsNull(flat);
        List<HouseEquipment> equipments = flat.getAllHouseEquipment();
        new CheckParametrOfHouseEquipment().isEmpty(equipments);

        return Collections.max(equipments, new EquipmentComparator());
    }
}
