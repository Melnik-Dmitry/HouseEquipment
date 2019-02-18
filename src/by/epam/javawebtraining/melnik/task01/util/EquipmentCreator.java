package by.epam.javawebtraining.melnik.task01.util;

import by.epam.javawebtraining.melnik.task01.model.entity.Warehouse;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Microwave;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Multicooker;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Toast;
import by.epam.javawebtraining.melnik.task01.exception.NullLink;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.ArrayList;
import java.util.List;

public class EquipmentCreator {

    private static List<HouseEquipment> createEquipmentList() {
        HouseEquipment toast = new Toast(1000, 700, true);
        HouseEquipment toast2 = new Toast(1000, 700, false);

        HouseEquipment multicooker1 = new Multicooker(1500, 1050, 16);
        HouseEquipment multicooker2 = new Multicooker(1200, 840, 25);

        HouseEquipment microwave1 = new Microwave(1500, 1050, 20);
        HouseEquipment microwave2 = new Microwave(1000, 700, 17);

       List<HouseEquipment> equipmentList = new ArrayList<>();
        equipmentList.add(toast);
        equipmentList.add(toast);
        equipmentList.add(multicooker1);
        equipmentList.add(multicooker2);
        equipmentList.add(microwave1);
        equipmentList.add(microwave2);

        return equipmentList;
    }

    public static void addEquipmentOnWarehose (Warehouse warehouse){
        try {
            new CheckParametrOfHouseEquipment().IsNull(warehouse);
        } catch (NullLink nullLink) {
            nullLink.printStackTrace();
        }
        for (HouseEquipment he: createEquipmentList()) {
            warehouse.getWarehouseStock().add(he);
        }
    }
}
