package by.epam.javawebtraining.melnik.task01.model.validation.checllink;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public interface CheckParametrOfHouseEquipmentREnamed<T extends HouseEquipment> {

    boolean checkIsNull (List <T> equipments);

    boolean checkIsEmpty (List <T> equipments);
}
