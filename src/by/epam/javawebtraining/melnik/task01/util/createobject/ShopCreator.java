package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

public class ShopCreator {

    public static Shop createShop() {
        return new Shop ();
    }

    public static Shop createShopWithParameter(HouseEquipment[] houseEquipments)
            throws NullLinkException {
        new CheckParametrOfHouseEquipment ().IsNull ( houseEquipments );
        return new Shop ( houseEquipments );
    }
}
