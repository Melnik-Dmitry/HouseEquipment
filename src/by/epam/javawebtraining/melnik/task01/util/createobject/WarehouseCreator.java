package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.List;

public class WarehouseCreator {

    public static Warehouse createWarehouse() {
        return new Warehouse ();
    }

    public static Warehouse createWarehouseWithParameter(List<HouseEquipment> warehouseStock)
            throws NullLinkException {

        new CheckParametrOfHouseEquipment ().IsNull ( warehouseStock );
        return new Warehouse ( warehouseStock );
    }
}
