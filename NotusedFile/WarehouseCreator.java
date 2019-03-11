package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Warehouse;

public class WarehouseCreator {

    public static Warehouse createWarehouse() {
        return new Warehouse ();
    }

//    public static Warehouse createWarehouseWithParameter(MyList<HouseEquipment> warehouseStock)
//            throws NullLinkException {
//
//        new CheckBuildingParameters ().IsNull ( warehouseStock );
//        return new Warehouse ( warehouseStock );
//    }
}
