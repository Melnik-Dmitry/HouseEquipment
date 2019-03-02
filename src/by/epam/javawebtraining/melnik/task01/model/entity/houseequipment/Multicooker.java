package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.AmountOfProgramException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

public class Multicooker extends HouseEquipment {

    public static final int MAX_PROGRAM_AMOUNT = 40;

    private int amountOfProgram;

    public Multicooker() {
    }

    public Multicooker(double generalPower, double powerConsumption, int amountOfProgram) {
        super ( generalPower, powerConsumption, HouseEquipmentType.MULTICOOKER );
        if (amountOfProgram <= 0 || amountOfProgram > MAX_PROGRAM_AMOUNT) {
            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameter totalPower was set by default" );
            return;
        }
        this.amountOfProgram = amountOfProgram;
    }

    public int getAmountOfProgram() {
        return amountOfProgram;
    }

    public void setAmountOfProgram(int amountOfProgram) throws AmountOfProgramException {
        if (amountOfProgram <= 0 || amountOfProgram > MAX_PROGRAM_AMOUNT) {
            throw new AmountOfProgramException();
        }
        this.amountOfProgram = amountOfProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Multicooker)) return false;
        if (!super.equals ( o )) return false;
        Multicooker that = (Multicooker) o;
        return amountOfProgram == that.amountOfProgram;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( super.hashCode (), amountOfProgram );
    }

    @Override
    public String toString() {
        return "Multicooker{" + "amountOfProgram = " + amountOfProgram
                + ", " + super.toString () + "}";
    }
}
