package by.epam.javawebtraining.melnik.task01.model.controller;

import by.epam.javawebtraining.melnik.task01.model.action.EquipmentCreator;
import by.epam.javawebtraining.melnik.task01.model.action.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.entity.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.Warehouse;

public class appController {
    public static void main(String[] args) {
        run();
    }


    public static void run() {
        EquipmentCreator equipmentCreator = new EquipmentCreator();
        Warehouse warehouse = new Warehouse();
        Flat flat = new Flat(10, 3);
        FlatOwner flatOwner = new FlatOwner("Melnik", flat);

        equipmentCreator.addEquipmentOnWarehose(warehouse);

        flatOwner.addAllHouseEquipmentInFlat
                (flatOwner.buyHouseEquipmentFromWarehouse(flat.getTotalNumberOfHouseEquipment(), warehouse));

        for (int i = 0; i < flat.getAllHouseEquipment().size(); i++) {
            System.out.println(flat.getAllHouseEquipment().get(i));
        }
    }
}
