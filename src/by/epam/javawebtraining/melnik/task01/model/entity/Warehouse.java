package by.epam.javawebtraining.melnik.task01.model.entity;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warehouse {

    private List<HouseEquipment> warehouseStock;

    public Warehouse() {
        warehouseStock = new ArrayList<>();
    }

    public Warehouse(List<HouseEquipment> warehouseStock) {
        try {
            new CheckParametrOfHouseEquipment().IsNull(warehouseStock);
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }
        this.warehouseStock = warehouseStock;
    }

    public List<HouseEquipment> getWarehouseStock() {
        return warehouseStock;
    }

    public void setWarehouseStock(List<HouseEquipment> warehouseStock) {
        try {
            new CheckParametrOfHouseEquipment().IsNull(warehouseStock);
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }
        this.warehouseStock = warehouseStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse)) return false;
        Warehouse warehouse = (Warehouse) o;
        return warehouseStock.equals(warehouse.warehouseStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warehouseStock);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseStock = " + warehouseStock + '}';
    }
}
