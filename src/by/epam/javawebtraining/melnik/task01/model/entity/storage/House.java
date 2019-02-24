package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public class House extends Building {

    public House() {
    }

    public House(List<HouseEquipment> allHouseEquipment) {
        super(allHouseEquipment);
    }

    @Override
    public String toString() {
        return "House{" + super.toString() + "}";
    }
}
