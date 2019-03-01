package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

public class ShopSection {

    private HouseEquipment[] equipments;

    public ShopSection() {
        equipments = new HouseEquipment[0];
    }

    public ShopSection(HouseEquipment[] equipments) {
        this.equipments = equipments;
    }

    public HouseEquipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(HouseEquipment[] equipments) {
        this.equipments = equipments;
    }
}
