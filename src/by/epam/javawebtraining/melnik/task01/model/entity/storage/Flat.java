package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.FlatsNumberException;

import java.util.Objects;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class Flat extends Building {

    private int flatsNumber;

    public Flat() {
    }

    public Flat(int flatsNumber) {
        super();
        if (flatsNumber < 0) {
            appLogger.warn("Invalid constructor parameters. Default values.");
            return;
        }
        this.flatsNumber = flatsNumber;
    }

    public Flat(Flat original) {
        super(original);
        this.flatsNumber = original.flatsNumber;
    }

    public Flat(HouseEquipment[] equipments, int flatsNumber) {
        super(equipments);
        if (flatsNumber < 0) {
            appLogger.warn("Invalid constructor parameters. Default values.");
            return;
        }
        this.flatsNumber = flatsNumber;
    }

    public int getFlatsNumber() {
        return flatsNumber;
    }

    public void setFlatsNumber(int flatsNumber) throws FlatsNumberException {
        if (flatsNumber <= 0) {
            appLogger.error("Invalid method parameter.");
            throw new FlatsNumberException();
        }
        this.flatsNumber = flatsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Flat)) {return false;}
        if (!super.equals(o)) {return false;}
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


