package by.epam.javawebtraining.melnik.task01.util.checkparameter;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;

public interface CheckIsEmpty {

    boolean isEmpty(HouseEquipment [] equipments) throws EmptyListException;
}
