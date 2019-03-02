package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;

public class ShopSection {

    private HouseEquipment[] equipments;

    public ShopSection() {
        equipments = new HouseEquipment[0];
    }

    public ShopSection(HouseEquipment[] equipments) throws NullLinkException {

        if (equipments == null) {
            throw new NullLinkException();
        }
        this.equipments = equipments;
    }

    public HouseEquipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(HouseEquipment[] equipments) throws NullLinkException {

        if (equipments == null) {
            throw new NullLinkException();
        }
        this.equipments = equipments;
    }
}
