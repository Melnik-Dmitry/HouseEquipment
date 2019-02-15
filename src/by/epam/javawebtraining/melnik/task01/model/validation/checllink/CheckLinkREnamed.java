package by.epam.javawebtraining.melnik.task01.model.validation.checllink;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;

import java.util.List;

public class CheckLinkREnamed implements CheckParametrOfHouseEquipmentREnamed<HouseEquipment> {


    @Override
    public boolean checkIsNull(List<HouseEquipment> equipments) {
        if (equipments == null) {
            try {
                throw new NullLink();
            } catch (NullLink nullLink) {
                nullLink.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public boolean checkIsEmpty(List<HouseEquipment> equipments) {
        if (equipments.isEmpty()) {
            try {
                throw new EmptyList();
            } catch (EmptyList emptyList) {
                emptyList.printStackTrace();
            }
        }
        return true;
    }
}
