package by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

public interface HouseEquipmentCreator {

	<T extends HouseEquipment> T makeHouseEquipment (String data);
}
