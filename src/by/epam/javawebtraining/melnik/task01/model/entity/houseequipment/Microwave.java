package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

public class Microwave extends HouseEquipment {

    private int innerVolume;

    public Microwave() {
    }

    public Microwave(double generalPower, double powerConsumption, int innerVolume) {
        super(generalPower, powerConsumption);
        if (innerVolume != 17 && innerVolume != 20) {
            new ConsolePrint ().print("Invalid parameter in constructor. Parameters were set by default");
            return;
        }
        this.innerVolume = innerVolume;
    }

    public int getInnerVolume() {
        return innerVolume;
    }

    public void setInnerVolume(int innerVolume) throws InvalidParameterException {
        if (innerVolume != 17 && innerVolume != 20) {
           throw new InvalidParameterException();
        }
        this.innerVolume = innerVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Microwave)) return false;
        if (!super.equals(o)) return false;
        Microwave microwave = (Microwave) o;
        return innerVolume == microwave.innerVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), innerVolume);
    }

    @Override
    public String toString() {
        return "Microwave{" + "innerVolume = " + innerVolume + ", " + super.toString() + "} ";
    }
}
