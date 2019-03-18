package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.conversionarray.ConversionArray;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class FlatOwner {

    private String surname;
    private Building flat;

    public FlatOwner() {
        surname = "";
        flat = new Flat();
    }

    public FlatOwner(String surname, Building flat) {

        if (surname.isEmpty() || surname == null || flat == null) {
            appLogger.info("Parameter is null. Set default capacity");
            this.surname = "";
            this.flat = new Flat();
            return;
        }
        this.surname = surname;
        this.flat = flat;
    }

    public String getSurname() {
        return surname;
    }

    public Building getFlat() {
        return flat;
    }

    public void setSurname(String surname) throws FlatOwnerSurnameException {
        if (surname.isEmpty() || surname == null) {
            appLogger.error("Invalid method parameters.");
            throw new FlatOwnerSurnameException();
        }
        this.surname = surname;
    }

    public void setFlat(Building flat) throws InvalidParameterException {
        if (!new CheckBuildingParameters().IsNull(flat)) {
            this.flat = flat;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlatOwner)) return false;
        FlatOwner flatOwner = (FlatOwner) o;
        return surname.equals(flatOwner.surname) &&
                flat.equals(flatOwner.flat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, flat);
    }

    public HouseEquipment[] buyHouseEquipment(int amountOfEquipments, Building shop)
            throws MethodParameterException, InvalidParameterException {

        if (amountOfEquipments <= 0) {
            appLogger.error("Invalid method parameters.");
            throw new MethodParameterException();
        }
        new CheckBuildingParameters().IsNull(shop);

        int amountOfEquipmentsInShop = shop.amountOfEquipments();
        HouseEquipment[] returnedEquipments = new HouseEquipment[0];

        if (amountOfEquipments > amountOfEquipmentsInShop) {
            new ConsolePrint().print("There are only" + amountOfEquipmentsInShop + " in shop.");

            returnedEquipments = ConversionArray.addElementsIncreaseArray
                    (returnedEquipments, shop.getEquipments());

        } else {
            for (int i = 0; i < amountOfEquipments; i++) {
                returnedEquipments = ConversionArray.addElementsIncreaseArray
                        (returnedEquipments, shop.getEquipments()[i]);
            }
        }

        return returnedEquipments;
    }

    public void addAllHouseEquipmentInFlat(HouseEquipment[] equipments)
            throws EmptyListException, InvalidParameterException {

        new CheckBuildingParameters().IsNull(equipments);
        new CheckBuildingParameters().isEmpty(equipments);

        HouseEquipment[] temp = ConversionArray.addElementsIncreaseArray(flat.getEquipments(), equipments);
        flat.setEquipments(temp);
    }

    @Override
    public String toString() {
        return "FlatOwner{" +
                "surname = " + surname + '\'' +
                ", flat = " + flat +
                '}';
    }
}
