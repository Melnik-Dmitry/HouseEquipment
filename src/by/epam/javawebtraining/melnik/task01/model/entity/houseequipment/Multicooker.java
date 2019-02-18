package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

public class Multicooker extends HouseEquipment {

    private int amountOfProgram;

    public Multicooker() {
    }

    public Multicooker(double generalPower, double powerConsumption, int amountOfProgram) {
        super(generalPower, powerConsumption);
        if (amountOfProgram <= 0 || amountOfProgram > 40) {
            new ConsolePrint().print("Invalid parameter in constructor. Parameter totalPower was set by default");
            return;
        }
        this.amountOfProgram = amountOfProgram;
    }

    public int getAmountOfProgram() {
        return amountOfProgram;
    }

    public void setAmountOfProgram(int amountOfProgram) throws InvalidParameterException {
        if (amountOfProgram <= 0 || amountOfProgram > 40) {
            throw new InvalidParameterException();
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
