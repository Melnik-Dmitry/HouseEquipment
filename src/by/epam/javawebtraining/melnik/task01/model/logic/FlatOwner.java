package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlatOwner {

    private String surname;
    private ComercialBuilding flat;

    public FlatOwner() {
    }

    public FlatOwner(String surname, ComercialBuilding flat) throws NullLinkException {

        if (surname.isEmpty()) {
            new ConsolePrint().print("Surname cann't be empty");
        } else if (flat == null) {
            new ConsolePrint().print("Link cann't be null");
        }
        this.surname = surname;
        this.flat = flat;
    }

    public String getSurname() throws FlatOwnerSurnameException, NullLinkException {
        if (surname.isEmpty()) {
            throw new FlatOwnerSurnameException();
        } else if (surname == null) {
            throw new NullLinkException();
        }
        return surname;
    }

    public ComercialBuilding getFlat() throws NullLinkException {
        if (flat == null) {
            throw new NullLinkException();
        }
        return flat;
    }

    public void setSurname(String surname) throws FlatOwnerSurnameException, NullLinkException {
        if (surname.isEmpty()) {
            throw new FlatOwnerSurnameException();
        } else if (surname == null) {
            throw new NullLinkException();
        }
        this.surname = surname;
    }

    public void setFlat(Flat flat) throws NullLinkException {
        if (flat == null) {
            throw new NullLinkException();
        }
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

    public List<HouseEquipment> buyHouseEquipmentFromWarehouse(int amountOfEquipments, ComercialBuilding warehouse)
            throws InvalidParameterException, NullLinkException, MethodParameterException {

        if (amountOfEquipments <= 0) {
            throw new MethodParameterException();
        }
        new CheckParametrOfHouseEquipment().IsNull(warehouse);

        int amountOfEquipmentsOnWarehouse = warehouse.getHouseEquipments().size();
        List<HouseEquipment> equipments = null;

        if (amountOfEquipments > amountOfEquipmentsOnWarehouse) {
            new ConsolePrint().print("There are only" + amountOfEquipmentsOnWarehouse + " on warehouse.");

            equipments = new ArrayList<>(amountOfEquipmentsOnWarehouse);

            for (int i = 0; i < amountOfEquipmentsOnWarehouse; i++) {
                equipments.add(warehouse.getHouseEquipments().get(i));
            }
        } else {
            equipments = new ArrayList<>(amountOfEquipments);

            for (int i = 0; i < amountOfEquipments; i++) {
                equipments.add(warehouse.getHouseEquipments().get(i));
            }
        }

        return equipments;
    }

    public void addAllHouseEquipmentInFlat(List<HouseEquipment> equipments)
            throws EmptyListException, NullLinkException {

        new CheckParametrOfHouseEquipment().isEmpty(equipments);
        new CheckParametrOfHouseEquipment().IsNull(equipments);

        for (HouseEquipment he : equipments) {
            flat.getHouseEquipments().add(he);
        }
    }

    @Override
    public String toString() {
        return "FlatOwner{" +
                "surname = " + surname + '\'' +
                ", flat = " + flat +
                '}';
    }
}
