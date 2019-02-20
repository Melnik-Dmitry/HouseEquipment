package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.util.EquipmentCreatorOnWaterhouse;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatOwnerCrator;
import by.epam.javawebtraining.melnik.task01.util.createobject.WarehouseCreator;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

public class appController {
    public static void main(String[] args) {
        run();

    }


    public static void run() {

        Warehouse warehouse = WarehouseCreator.createWarehouse();
        Flat flat = FlatCreator.createFlatWithParameters(10, 3);
        FlatOwner flatOwner = FlatOwnerCrator.createFlatOwnerWithParameters("Melnik", flat);

        try {
            EquipmentCreatorOnWaterhouse.addEquipmentOnWarehose(warehouse);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        try {
            flatOwner.addAllHouseEquipmentInFlat
                    (flatOwner.buyHouseEquipmentFromWarehouse(flat.getTotalNumberOfHouseEquipment(), warehouse));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }

        for (int i = 0; i < flat.getAllHouseEquipment().size(); i++) {
            String currentEquipment = flat.getAllHouseEquipment().get(i) + "";
            new ConsolePrint().print(currentEquipment);
        }
    }
}
