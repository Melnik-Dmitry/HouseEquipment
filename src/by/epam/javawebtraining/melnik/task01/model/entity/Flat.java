package by.epam.javawebtraining.melnik.task01.model.entity;

import by.epam.javawebtraining.melnik.task01.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.exception.ConstructorInvalidParametrException;
import by.epam.javawebtraining.melnik.task01.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flat {

    private int flatsNumber;
    private int totalNumberOfHouseEquipment;
    private List <HouseEquipment> allHouseEquipment;

    public Flat() {
    }

    public Flat(int flatsNumber, int totalNumberOfHouseEquipment) {
        if (flatsNumber <= 0 & totalNumberOfHouseEquipment < 0) {
            try {
                throw new ConstructorInvalidParametrException();
            } catch (ConstructorInvalidParametrException e) {
                e.printStackTrace();
            }
        }
        this.flatsNumber = flatsNumber;
        this.totalNumberOfHouseEquipment = totalNumberOfHouseEquipment;
        allHouseEquipment = new ArrayList<>(totalNumberOfHouseEquipment);
    }

    public int getFlatsNumber() {
        return flatsNumber;
    }

    public int getTotalNumberOfHouseEquipment() {
        return totalNumberOfHouseEquipment;
    }

    public List <HouseEquipment> getAllHouseEquipment() {
        return allHouseEquipment;
    }

    public void setFlatsNumber(int flatsNumber) throws InvalidParameterException {
        if (flatsNumber <= 0) {
            throw new InvalidParameterException();
        }
        this.flatsNumber = flatsNumber;
    }

    public void setTotalNumberOfHouseEquipment(int totalNumberOfHouseEquipment) throws InvalidParameterException {
        if (totalNumberOfHouseEquipment < 0) {
            throw new InvalidParameterException();
        }
        this.totalNumberOfHouseEquipment = totalNumberOfHouseEquipment;
    }

    public void setAllHouseEquipment(List<HouseEquipment> allHouseEquipment) {
        try {
            new CheckParametrOfHouseEquipment().IsNull(allHouseEquipment);
            new CheckParametrOfHouseEquipment().isEmpty(allHouseEquipment);
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        } catch (EmptyList emptyList) {
            emptyList.printStackTrace();
        }
        this.allHouseEquipment = allHouseEquipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat)) return false;
        Flat flat = (Flat) o;
        return flatsNumber == flat.flatsNumber &&
                totalNumberOfHouseEquipment == flat.totalNumberOfHouseEquipment &&
                allHouseEquipment.equals(flat.allHouseEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flatsNumber, totalNumberOfHouseEquipment, allHouseEquipment);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatsNumber = " + flatsNumber +
                ", totalNumberOfHouseEquipment = " + totalNumberOfHouseEquipment +
                ", allHouseEquipment = " + allHouseEquipment +
                '}';
    }
}


