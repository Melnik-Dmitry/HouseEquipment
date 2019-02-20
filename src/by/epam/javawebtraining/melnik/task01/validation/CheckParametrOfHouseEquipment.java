package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;

import java.util.List;

public class CheckParametrOfHouseEquipment implements CheckIsNull, CheckListIsEmpty <HouseEquipment> {

    @Override
    public boolean IsNull(Object link) throws NullLink {
        if (link == null) {
            throw new NullLink();
        }
        return true;
    }

    @Override
    public boolean isEmpty(List<HouseEquipment> list) throws EmptyList {
        if (list.isEmpty()) {
            throw new EmptyList();
        }
        return true;
    }
}
