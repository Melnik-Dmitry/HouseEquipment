package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.FlatsNumberException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.logic.ShopAssistant;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower.SearchParameterTotalEnergy;
import by.epam.javawebtraining.melnik.task01.model.logic.powercontrol.PowerFlatEquipmentControl;
import by.epam.javawebtraining.melnik.task01.model.logic.sorting.SortHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.EquipmentCreatorOnWarehouse;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.*;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class appController {
    public static void main(String[] args) {
        runEntityWithArrayList();
//        runEntityWithMassive ();
    }


    public static void runEntityWithArrayList() {

        ComercialBuilding warehouse = WarehouseCreator.createWarehouse();
        ComercialBuilding flat = null;

        try {
            flat = FlatCreator.createFlatWithParameters(10);
            FlatOwner flatOwner = FlatOwnerCreator.createFlatOwnerWithParameters("Melnik", flat);
            EquipmentCreatorOnWarehouse.addEquipmentOnWarehose(warehouse, 6);

            flatOwner.addAllHouseEquipmentInFlat
                    (flatOwner.buyHouseEquipmentFromWarehouse(3, warehouse));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        } catch (NullLinkException e) {
            e.printStackTrace();
        } catch (FlatsNumberException e) {
            e.printStackTrace();
        } catch (FlatOwnerSurnameException e) {
            e.printStackTrace();
        } catch (MethodParameterException e) {
            e.printStackTrace();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }

        Print printer = PrintCreator.createPrint();
        printer.print(warehouse.toString());
        printer.print(flat.toString());

        SearchParameter searchParameterTotalEnergy = new SearchParameterTotalEnergy();
        try {
            HouseEquipment maxOnWaterhouse = ((SearchParameterTotalEnergy) searchParameterTotalEnergy)
                    .takeEquipmentWithMaxPower(warehouse);
            printer.print(maxOnWaterhouse.toString());

            HouseEquipment maxInFlat = ((SearchParameterTotalEnergy) searchParameterTotalEnergy).
                    takeEquipmentWithMaxPower(flat);
            printer.print(maxInFlat.toString());

            HouseEquipment minOnWaterhouse = ((SearchParameterTotalEnergy) searchParameterTotalEnergy)
                    .takeEquipmentWithMinPower(warehouse);
            printer.print(minOnWaterhouse.toString());

            HouseEquipment minInFlat = ((SearchParameterTotalEnergy) searchParameterTotalEnergy)
                    .takeEquipmentWithMinPower(flat);
            printer.print(minInFlat.toString());

        } catch (NullLinkException e) {
            e.printStackTrace();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }

        new SortHouseEquipment().sortSomething(warehouse, new EquipmentComparator());
        printer.print(warehouse.toString());
        new SortHouseEquipment().sortSomething(flat, new EquipmentComparator());
        printer.print(flat.toString());

        try {
            printer.print(String.valueOf(new PowerFlatEquipmentControl().deemTotalPower(warehouse)));
            printer.print(String.valueOf(new PowerFlatEquipmentControl().deemPowerConsumption(warehouse)));
        } catch (NullLinkException e) {
            e.printStackTrace();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }


        try {
            for (int i = 0; i < warehouse.getHouseEquipments().size(); i++) {
                warehouse.getHouseEquipments().get(i).turnOn();
            }
        } catch (NullLinkException e) {
            e.printStackTrace();
        }

        try {
            printer.print(String.valueOf(new PowerFlatEquipmentControl().deemPowerConsumption(warehouse)));
        } catch (NullLinkException e) {
            e.printStackTrace();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }


    public static void runEntityWithMassive() {

        HouseEquipment[] first = new HouseEquipment[5];
        for (int i = 0; i < first.length; i++) {
            first[i] = CreatorHouseEquipment.createHouseEquipment
                    (RandomTypeOfHouseEquipment.makeHouseEquipmentType());
        }

        Shop shop = null;
        try {
            shop = ShopCreator.createShopWithParameter(first);
        } catch (NullLinkException e) {
            e.printStackTrace();
        }

        Print printer = PrintCreator.createPrint();
        printer.print(shop.toString());
        try {
            printer.print((new SearchParameterTotalEnergy().takeEquipmentWithMaxPower(shop)).toString());
        } catch (NullLinkException e) {
            e.printStackTrace();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }

        HouseEquipment equipment = CreatorHouseEquipment.createHouseEquipment
                (RandomTypeOfHouseEquipment.makeHouseEquipmentType());
        try {
            ShopAssistant.sortEquipmetForSection(shop);

            ShopAssistant.addEquipmentInSection(shop, equipment);
        } catch (NullLinkException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
