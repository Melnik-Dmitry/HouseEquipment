package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class TotalEnergyEquipmentExeption extends ProgectException {

    public static final String TOTAL_ENERGY = "Parameter Total Energy wasn't seted correctly";

    public TotalEnergyEquipmentExeption() {
        super(TOTAL_ENERGY);
    }
}
