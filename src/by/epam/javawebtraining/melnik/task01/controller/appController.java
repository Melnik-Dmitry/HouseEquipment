package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.House;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.logic.sorting.SortHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.EquipmentCreatorOnWarehouse;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatOwnerCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.WarehouseCreator;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.ArrayList;
import java.util.List;

public class appController {
    public static void main(String[] args) {
        run();
    }


    public static void run() {

        Warehouse warehouse = WarehouseCreator.createWarehouse();
        Flat flat = FlatCreator.createFlatWithParameters(10, 3);
        FlatOwner flatOwner = FlatOwnerCreator.createFlatOwnerWithParameters("Melnik", flat);

        try {
            EquipmentCreatorOnWarehouse.addEquipmentOnWarehose(warehouse, 6);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        try {
            flatOwner.addAllHouseEquipmentInFlat
                    (flatOwner.buyHouseEquipmentFromWarehouse(flat.getTotalNumberOfHouseEquipment(), warehouse));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        } catch (NullLinkException nullLinkException) {
            nullLinkException.printStackTrace();
        }

        for (int i = 0; i < flat.getAllHouseEquipment().size(); i++) {
            String currentEquipment = flat.getAllHouseEquipment().get(i) + "";
            new ConsolePrint().print(currentEquipment);
        }
    }
}
