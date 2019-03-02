package by.epam.javawebtraining.melnik.task01.validation;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;

import java.util.List;

public class CheckParametrOfHouseEquipment implements CheckIsNull, CheckIsEmpty<HouseEquipment> {

    @Override
    public boolean IsNull(Object link) throws NullLinkException {
        if (link == null) {
            throw new NullLinkException ();
        }
        return true;
    }

    @Override
    public boolean isEmpty(List<HouseEquipment> list) throws EmptyListException {
        if (list.isEmpty ()) {
            throw new EmptyListException ();
        }
        return true;
    }
}
