package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.*;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;

import java.util.Arrays;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class Building {

    public static int DEFAULT_CAPACITY = 10;
    private HouseEquipment[] equipments;

    public Building() {
        equipments = new HouseEquipment[DEFAULT_CAPACITY];
    }

    public Building(HouseEquipment[] equipments) {
        if (equipments == null) {
            this.equipments = new HouseEquipment[DEFAULT_CAPACITY];
            appLogger.info("Parameter is null. Set default capacity");
            return;
        }
        this.equipments = equipments;
    }

    public Building(Building original) {

        HouseEquipment[] equipm = new HouseEquipment[original.equipments.length];
        for (int i = 0; i < equipm.length; i++) {

            if (original.equipments[i] == null) {
                continue;
            }

            if (original.equipments[i].getType().equals(HouseEquipmentType.MICROWAWE)) {
                equipm[i] = new Microwave((Microwave) original.equipments[i]);

            } else if (original.equipments[i].getType().equals(HouseEquipmentType.MULTICOOKER)) {
                equipm[i] = new Multicooker((Multicooker) original.equipments[i]);

            } else {
                equipm[i] = new Toast((Toast) original.equipments[i]);
            }
        }

        this.equipments = equipm;
    }

    public HouseEquipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(HouseEquipment[] equipments) throws InvalidParameterException {
        if (!new CheckBuildingParameters().IsNull(equipments)) {
            this.equipments = equipments;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return Arrays.equals(equipments, building.equipments);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(equipments);
    }

    public final int amountOfEquipments() {
        int result = 0;
        for (HouseEquipment equipment : equipments) {
            if (equipment != null) {
                result++;
            }
        }
        return result;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("amount equinments = " + amountOfEquipments() + '\n');

        for (HouseEquipment he : equipments) {
            if (he == null) {
                continue;
            }
            builder.append(he.toString() + '\n');
        }

        return builder.toString();
    }
}
