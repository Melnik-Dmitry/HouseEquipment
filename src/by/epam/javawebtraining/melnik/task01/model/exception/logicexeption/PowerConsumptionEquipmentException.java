package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProjectException;

public class PowerConsumptionEquipmentException extends ProjectException {

//    public static final String POWER_CONSUMPTION = "Parameter Power Consumption wasn't seted correctly";

    public PowerConsumptionEquipmentException() {
        super();
    }

    public PowerConsumptionEquipmentException(String message) {
        super ( message );
    }
}
