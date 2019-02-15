package by.epam.javawebtraining.melnik.task01.model.parametersearch.searchparametrpower;

import by.epam.javawebtraining.melnik.task01.model.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.validation.checllink.CheckLinkREnamed;

import java.util.Collections;
import java.util.List;

public class SearchParametrPowerConsumption implements SearchParametrPower<HouseEquipment> {

    @Override
    public HouseEquipment takeEquipmentWithMinPower(List<HouseEquipment> equipments) {
        new CheckLinkREnamed().checkIsNull(equipments);
        new CheckLinkREnamed().checkIsEmpty(equipments);

        return Collections.min(equipments, new EquipmentComparator());
    }

    @Override
    public HouseEquipment takeEquipmentWithMaxPower(List<HouseEquipment> equipments) {
        new CheckLinkREnamed().checkIsNull(equipments);
        new CheckLinkREnamed().checkIsEmpty(equipments);

        return Collections.max(equipments, new EquipmentComparator());
    }
}
