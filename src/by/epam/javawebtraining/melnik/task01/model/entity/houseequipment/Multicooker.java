package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.AmountOfProgramException;

import java.util.Objects;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class Multicooker extends HouseEquipment {

    public static final int MAX_PROGRAM_AMOUNT = 40;

    private int amountOfProgram;

    public Multicooker() {
        super.setType(HouseEquipmentType.MULTICOOKER);
    }

    public Multicooker(double generalPower, double powerConsumption, int amountOfProgram) {
        super(generalPower, powerConsumption, HouseEquipmentType.MULTICOOKER);
        if (amountOfProgram <= 0 || amountOfProgram > MAX_PROGRAM_AMOUNT) {
            appLogger.info("Invalid constructor parameters. Default values");
            return;
        }
        this.amountOfProgram = amountOfProgram;
    }

    public Multicooker(Multicooker original) {
        super(original);
        this.amountOfProgram = original.amountOfProgram;
    }

    public int getAmountOfProgram() {
        return amountOfProgram;
    }

    public void setAmountOfProgram(int amountOfProgram) throws AmountOfProgramException {
        if (amountOfProgram <= 0 || amountOfProgram > MAX_PROGRAM_AMOUNT) {
            appLogger.warn("Invalid method parameters.");
            throw new AmountOfProgramException();
        }
        this.amountOfProgram = amountOfProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Multicooker)) return false;
        if (!super.equals(o)) return false;
        Multicooker that = (Multicooker) o;
        return amountOfProgram == that.amountOfProgram;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountOfProgram);
    }

    @Override
    public String toString() {
        return "Multicooker{" + "amountOfProgram = " + amountOfProgram
                + ", " + super.toString() + "}";
    }
}
