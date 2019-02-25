package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//
public class Warehouse extends Building{

//    private List<HouseEquipment> warehouseStock;

    public Warehouse() {
//        warehouseStock = new ArrayList<>();
    }

    public Warehouse(List<HouseEquipment> warehouseStock) {
        super(warehouseStock);
//        try {
//            new CheckParametrOfHouseEquipment().IsNull(warehouseStock);
//        } catch (NullLinkException nullLinkException) {
//            nullLinkException.printStackTrace();
//        }
//        this.warehouseStock = warehouseStock;
    }

//    public List<HouseEquipment> getWarehouseStock() {
//        return warehouseStock;
//    }
//
//    public void setWarehouseStock(List<HouseEquipment> warehouseStock) throws NullLinkException {
//        new CheckParametrOfHouseEquipment().IsNull(warehouseStock);
//
//        this.warehouseStock = warehouseStock;
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
