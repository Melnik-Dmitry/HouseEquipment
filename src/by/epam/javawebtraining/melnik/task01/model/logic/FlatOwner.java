package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.convertarray.ConvertArray;
import by.epam.javawebtraining.melnik.task01.validation.CheckBuildingParameters;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

public class FlatOwner {

    private String surname;
    private Flat flat;

    public FlatOwner() {
    }

    public FlatOwner(String surname, Flat flat) {

        if (surname.isEmpty() || surname == null || flat == null) {
            new ConsolePrint().print("Surname cann't be empty. Parameters were seted by default");
            this.surname = "";
            this.flat = new Flat();
            return;
        }
        this.surname = surname;
        this.flat = flat;
    }

    public String getSurname() throws FlatOwnerSurnameException {
        if (surname.isEmpty() || surname == null) {
            throw new FlatOwnerSurnameException();
        }
        return surname;
    }

    public Building getFlat() {
        return flat;
    }

    public void setSurname(String surname) throws FlatOwnerSurnameException {
        if (surname.isEmpty() || surname == null) {
            throw new FlatOwnerSurnameException();
        }
        this.surname = surname;
    }

    public void setFlat(Flat flat) throws InvalidParameterException {
        new CheckBuildingParameters().IsNull(flat);
        this.flat = flat;
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
            throws NullLinkException, MethodParameterException, InvalidParameterException {


        if (amountOfEquipments <= 0) {
            throw new MethodParameterException();
        }
        new CheckBuildingParameters().IsNull(shop);

        int amountOfEquipmentsInShop = shop.amountOfEquipments();
        HouseEquipment[] returnedEquipments = new HouseEquipment[0];

        if (amountOfEquipments > amountOfEquipmentsInShop) {
            new ConsolePrint().print("There are only" + amountOfEquipmentsInShop + " in shop.");
//
//            HouseEquipment[] temp = ConvertArray.addElementsInDynamicArray
//                    (returnedEquipments, shop.getEquipments());
//
            returnedEquipments = ConvertArray.addElementsInDynamicArray
                    (returnedEquipments, shop.getEquipments());
            ;
        } else {
            for (int i = 0; i < amountOfEquipments; i++) {
//                HouseEquipment[] temp = ConvertArray.addElementsInDynamicArray(returnedEquipments, shop.getEquipments());
                returnedEquipments = ConvertArray.addElementsInDynamicArray(returnedEquipments, shop.getEquipments());
                ;
            }
        }

        return returnedEquipments;
    }

    public void addAllHouseEquipmentInFlat(HouseEquipment[] equipments)
            throws EmptyListException, NullLinkException, InvalidParameterException {

        new CheckBuildingParameters().isEmpty(equipments);
        new CheckBuildingParameters().IsNull(equipments);


        HouseEquipment[] temp = ConvertArray.addElementsInDynamicArray(flat.getEquipments(), equipments);
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
