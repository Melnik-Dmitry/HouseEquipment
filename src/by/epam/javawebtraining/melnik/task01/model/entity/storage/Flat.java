package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.FlatsNumberException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.List;
import java.util.Objects;

public class Flat extends ComercialBuilding {

    private int flatsNumber;

    public Flat() {
    }

    public Flat(int flatsNumber) {
        super();
        if (flatsNumber <= 0) {
            new ConsolePrint().print("Invalid parameter in constructor. Parameters were set by default");
            return;
        }
        this.flatsNumber = flatsNumber;
    }

    public Flat(List<HouseEquipment> houseEquipments, int flatsNumber) {
        super(houseEquipments);
        if (flatsNumber <= 0) {
            new ConsolePrint().print("Invalid parameter in constructor. Parameters were set by default");
            return;
        }
        this.flatsNumber = flatsNumber;
    }

    public int getFlatsNumber() {
        return flatsNumber;
    }

    public void setFlatsNumber(int flatsNumber) throws FlatsNumberException {
        if (flatsNumber <= 0) {
            throw new FlatsNumberException();
        }
        this.flatsNumber = flatsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat)) return false;
        if (!super.equals(o)) return false;
        Flat flat = (Flat) o;
        return flatsNumber == flat.flatsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flatsNumber);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatsNumber = " + flatsNumber + ", " +
                super.toString() + "} ";
    }
}


