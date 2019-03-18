package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.ShopAssistant;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class AddEquipmentController {

    public static void runAddElementsInShop() {
        HouseEquipment[] equipments = {
                CreatorHouseEquipment.createHouseEquipment
                        (RandomTypeOfHouseEquipment.makeHouseEquipmentType()),
                null,
                CreatorHouseEquipment.createHouseEquipment
                        (RandomTypeOfHouseEquipment.makeHouseEquipmentType()),
                null
        };

        Building shop = new Shop(equipments);

//        Building shop = null;
//        try {
//            shop = ShopCreator.createShopWithParameter
//                    (CreateArrayHouseEquipment.createArrayOfHouseEquipment(5));
//        } catch (InvalidParameterException e) {
//            e.printStackTrace();
//        } catch (MethodParameterException e) {
//            e.printStackTrace();
//        }
        Print printer = PrintCreator.createPrint();
        printer.print(shop.toString());

        HouseEquipment[] addedEquipments = null;
        try {
            addedEquipments = CreateArrayHouseEquipment.createArrayOfHouseEquipment(5);
        } catch (MethodParameterException e) {
            e.printStackTrace();
        }

        try {
            ShopAssistant.addEquipmetInShop((Shop) shop, addedEquipments);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        printer.print(shop.toString());
    }
}
