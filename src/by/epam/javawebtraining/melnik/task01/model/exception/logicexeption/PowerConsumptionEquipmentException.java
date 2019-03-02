package by.epam.javawebtraining.melnik.task01.model.exception.logicexeption;

import by.epam.javawebtraining.melnik.task01.model.exception.ProgectException;

public class PowerConsumptionEquipmentException extends ProgectException {

    public static final String POWER_CONSUMPTION = "Parameter Power Consumption wasn't seted correctly";

    public PowerConsumptionEquipmentException() {
        super(POWER_CONSUMPTION);
    }
}
