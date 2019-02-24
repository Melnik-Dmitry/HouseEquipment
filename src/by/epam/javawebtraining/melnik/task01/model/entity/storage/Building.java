package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.List;

public class Building {

    private List <HouseEquipment> allHouseEquipment;

    public Building() {
    }

    public Building(List<HouseEquipment> allHouseEquipment) {
        this.allHouseEquipment = allHouseEquipment;
    }

    public List<HouseEquipment> getAllHouseEquipment() {
        return allHouseEquipment;
    }

    public void setAllHouseEquipment(List<HouseEquipment> allHouseEquipment) {
        this.allHouseEquipment = allHouseEquipment;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("amount equinments = " + allHouseEquipment.size() + '\n');

        for (HouseEquipment auto : allHouseEquipment) {
            builder.append(auto.toString() + '\n');
        }
        builder.append('}');

        return builder.toString();

    }
}
