package by.epam.javawebtraining.melnik.task01.util.validation;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;

import java.util.List;

public interface CheckIsEmpty {

    boolean isEmpty(HouseEquipment [] equipments) throws EmptyListException;
}
