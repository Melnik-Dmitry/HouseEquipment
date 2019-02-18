package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.EquipmentCreator;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.Warehouse;
import by.epam.javawebtraining.melnik.task01.util.createobject.WarehouseCreator;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

public class appController {
    public static void main(String[] args) {
        run();
    }


    public static void run() {
        EquipmentCreator equipmentCreator = new EquipmentCreator();
        Warehouse warehouse = new WarehouseCreator().createNeededObject();
        Flat flat = new Flat(10, 3);
        FlatOwner flatOwner = new FlatOwner("Melnik", flat);

        equipmentCreator.addEquipmentOnWarehose(warehouse);

        try {
            flatOwner.addAllHouseEquipmentInFlat
                    (flatOwner.buyHouseEquipmentFromWarehouse(flat.getTotalNumberOfHouseEquipment(), warehouse));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < flat.getAllHouseEquipment().size(); i++) {
            String currentEquipment = flat.getAllHouseEquipment().get(i)+"";
            new ConsolePrint().print(currentEquipment);
        }
    }
}
