package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.exception.EmptyList;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlatOwner {

    private String surname;
    private Flat flat;

    public FlatOwner() {
    }

    public FlatOwner(String surname, Flat flat) {

        if (surname.isEmpty()) {
            new ConsolePrint().print("Surname cann't be empty");
        }

        try {
            new CheckParametrOfHouseEquipment().IsNull(flat);
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }


        this.surname = surname;
        this.flat = flat;
    }

    public String getSurname() {
        return surname;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()) {
            new ConsolePrint().print("Surname cann't be empty");
        }
        this.surname = surname;
    }

    public void setFlat(Flat flat) throws NullLink {

        new CheckParametrOfHouseEquipment().IsNull(flat);
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

    public List<HouseEquipment> buyHouseEquipmentFromWarehouse(int amountOfEquipments, Warehouse warehouse)
            throws InvalidParameterException, NullLink {
        if (amountOfEquipments <= 0) {
            throw new InvalidParameterException();
        }
        new CheckParametrOfHouseEquipment().IsNull(warehouse);

        int amountOfEquipmentsOnWarehouse = warehouse.getWarehouseStock().size();
        if (amountOfEquipments > amountOfEquipmentsOnWarehouse) {
            new ConsolePrint().print("There are only" + amountOfEquipmentsOnWarehouse + " on warehouse.");
        }

        List<HouseEquipment> equipments = new ArrayList<>(amountOfEquipments);
        for (int i = 0; i < amountOfEquipments; i++) {
            equipments.add(warehouse.getWarehouseStock().get(i));
        }
        return equipments;
    }

    public void addAllHouseEquipmentInFlat(List<HouseEquipment> equipments) {
        try {
            new CheckParametrOfHouseEquipment().isEmpty(equipments);
            new CheckParametrOfHouseEquipment().IsNull(equipments);
        } catch (EmptyList emptyList) {
            emptyList.printStackTrace();
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }

        for (HouseEquipment he : equipments) {
            flat.getAllHouseEquipment().add(he);
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
