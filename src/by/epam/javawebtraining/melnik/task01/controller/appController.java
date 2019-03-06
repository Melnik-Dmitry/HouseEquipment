package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArraysException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.ShopAssistant;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower.SearchParameterTotalEnergy;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class appController {
    public static void main(String[] args) {

		  run ();//
    }


    public static void run() {

        Building shop = null;
        try {
            shop = ShopCreator.createShopWithParameter
                    (CreateArrayHouseEquipment.createArrayOfHouseEquipment(5));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        } catch (MethodParameterException e) {
            e.printStackTrace();
        }

        Print printer = PrintCreator.createPrint();
        printer.print(shop.toString());

        try {
            printer.print((new SearchParameterTotalEnergy().takeEquipmentWithMaxPower(shop)).toString());
            printer.print((new SearchParameterTotalEnergy().takeEquipmentWithMinPower(shop)).toString());
        }  catch (EmptyListException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        HouseEquipment addedEquipment = CreatorHouseEquipment.createHouseEquipment
                (RandomTypeOfHouseEquipment.makeHouseEquipmentType());

        try {
            ShopAssistant.addEquipmetInShop(shop, addedEquipment);
        } catch (EndArraysException e) {
            e.printStackTrace();
        }

    }


}

