package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Warehouse;

import java.util.List;

public class WarehouseCreator {

    public static Warehouse createWarehouse() {
        return new Warehouse ();
    }

    public static Warehouse createWarehouseWithParameter(List<HouseEquipment> warehouseStock) {
        return new Warehouse ( warehouseStock );
    }
}
