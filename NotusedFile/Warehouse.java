package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public class Warehouse extends Building {

    public Warehouse() {
    }
//
//    public Warehouse(MyList<HouseEquipment> warehouseStock) {
//        super(warehouseStock);
//    }

    @Override
    public boolean equals(Object o) {
        return super.equals ( o );
    }

    @Override
    public int hashCode() {
        return super.hashCode ();
    }

    @Override
    public String toString() {
        return "Warehouse{ " + super.toString () + "}";
    }
}
