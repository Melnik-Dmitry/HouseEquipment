package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class TotalEnergyEquipmentException extends ProjectException {

//    public static final String TOTAL_ENERGY = "Parameter Total Energy wasn't seted correctly";

    public TotalEnergyEquipmentException() {
        super();
    }

    public TotalEnergyEquipmentException(String message) {
        super ( message );
    }
}
