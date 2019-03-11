package by.epam.javawebtraining.melnik.task01.util.createobject;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;

public class ShopCreator {

    public static Shop createShop() {
        return new Shop ();
    }

    public static Shop createShopWithParameter(HouseEquipment[] houseEquipments)
            throws  InvalidParameterException {

        new CheckBuildingParameters().IsNull ( houseEquipments );
        return new Shop ( houseEquipments );
    }
}
