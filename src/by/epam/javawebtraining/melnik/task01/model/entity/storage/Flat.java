package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.List;
import java.util.Objects;

//
public class Flat extends Building {

    private int flatsNumber;
//    private int totalNumberOfHouseEquipment;
//    private List<HouseEquipment> allHouseEquipment;

    public Flat() {
//        allHouseEquipment = new ArrayList<>();
    }

    public Flat(int flatsNumber) {
        this.flatsNumber = flatsNumber;
    }

    public Flat(List<HouseEquipment> houseEquipments, int flatsNumber) {// int totalNumberOfHouseEquipment
        super ( houseEquipments );
        if (flatsNumber <= 0) { //&& totalNumberOfHouseEquipment < 0
            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameters were set by default" );
            return;
        }
        this.flatsNumber = flatsNumber;
//        this.totalNumberOfHouseEquipment = totalNumberOfHouseEquipment;
//        allHouseEquipment = new ArrayList<>(totalNumberOfHouseEquipment);
    }

    public int getFlatsNumber() {
        return flatsNumber;
    }

//    public int getTotalNumberOfHouseEquipment() {
//        return totalNumberOfHouseEquipment;
//    }
//
//    public List<HouseEquipment> getAllHouseEquipment() {
//        return allHouseEquipment;
//    }

    public void setFlatsNumber(int flatsNumber) throws InvalidParameterException {
        if (flatsNumber <= 0) {
            throw new InvalidParameterException ();
        }
        this.flatsNumber = flatsNumber;
    }

//    public void setTotalNumberOfHouseEquipment(int totalNumberOfHouseEquipment) throws InvalidParameterException {
//        if (totalNumberOfHouseEquipment < 0) {
//            throw new InvalidParameterException();
//        }
//        this.totalNumberOfHouseEquipment = totalNumberOfHouseEquipment;
//        allHouseEquipment = new ArrayList<>(totalNumberOfHouseEquipment);
//    }

//    public void setAllHouseEquipment(List<HouseEquipment> allHouseEquipment) {
//        try {
//            new CheckParametrOfHouseEquipment().IsNull(allHouseEquipment);
//            new CheckParametrOfHouseEquipment().isEmpty(allHouseEquipment);
//        } catch (NullLinkException nullLinkException) {
//            nullLinkException.printStackTrace();
//        } catch (EmptyListException emptyListException) {
//            emptyListException.printStackTrace();
//        }
//        this.allHouseEquipment = allHouseEquipment;
//        totalNumberOfHouseEquipment = allHouseEquipment.size();
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Flat)) return false;
//        Flat flat = (Flat) o;
//        return flatsNumber == flat.flatsNumber &&
//                totalNumberOfHouseEquipment == flat.totalNumberOfHouseEquipment &&
//                allHouseEquipment.equals(flat.allHouseEquipment);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(flatsNumber, totalNumberOfHouseEquipment, allHouseEquipment);
//    }
//
//    @Override
//    public String toString() {
//        return "Flat{" +
//                "flatsNumber = " + flatsNumber +
//                ", totalNumberOfHouseEquipment = " + totalNumberOfHouseEquipment +
//                ", allHouseEquipment = " + allHouseEquipment +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat)) return false;
        if (!super.equals ( o )) return false;
        Flat flat = (Flat) o;
        return flatsNumber == flat.flatsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( super.hashCode (), flatsNumber );
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatsNumber = " + flatsNumber + ", " +
                super.toString () + "} ";
    }
}


