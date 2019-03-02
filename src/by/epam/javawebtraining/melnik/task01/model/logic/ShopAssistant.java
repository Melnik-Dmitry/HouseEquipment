package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ShopSection;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.convertarray.ConvertArray;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.Arrays;
import java.util.List;

public class ShopAssistant {

    public static void sortEquipmetForSection(ComercialBuilding shop) throws NullLinkException {

        new CheckParametrOfHouseEquipment ().IsNull ( shop );

        for (HouseEquipment equipment : shop.getHouseEquipments ()) {
            if (equipment.getType ().equals ( HouseEquipmentType.MICROWAWE )) {

                Shop tempShop = (Shop) shop;
                ShopSection tempSection = tempShop.getMicrowaveSection ();
                HouseEquipment[] tempEquipments = tempSection.getEquipments ();

                tempSection.setEquipments ( ConvertArray.addElementsInArray ( tempEquipments, equipment ) );
                tempShop.setMicrowaveSection ( tempSection );


            } else if (equipment.getType ().equals ( HouseEquipmentType.MULTICOOKER )) {

                Shop tempShop = (Shop) shop;
                ShopSection tempSection = tempShop.getMulticookerSection ();
                HouseEquipment[] tempEquipments = tempSection.getEquipments ();

                tempSection.setEquipments ( ConvertArray.addElementsInArray ( tempEquipments, equipment ) );
                tempShop.setMulticookerSection ( tempSection );

            } else {

                Shop tempShop = (Shop) shop;
                ShopSection tempSection = tempShop.getToastSection ();
                HouseEquipment[] tempEquipments = tempSection.getEquipments ();

                tempSection.setEquipments ( ConvertArray.addElementsInArray ( tempEquipments, equipment ) );
                tempShop.setToastSection ( tempSection );

            }
        }
    }

    private void prepear (List <HouseEquipment> equipments){


    }

    public static void addEquipmentInSection(ComercialBuilding shop, HouseEquipment... added) throws NullLinkException {

        new CheckParametrOfHouseEquipment ().IsNull ( shop );

        for (int i = 0; i < added.length; i++) {
            if (added[i].getType ().equals ( HouseEquipmentType.MICROWAWE )) {
                Shop tempShop = (Shop) shop;
                ShopSection tempSection = tempShop.getMicrowaveSection ();
                HouseEquipment[] tempEquipments = tempSection.getEquipments ();

                tempSection.setEquipments ( ConvertArray.addElementsInArray ( tempEquipments, added[i] ) );
                tempShop.setMicrowaveSection ( tempSection );
            } else if (added[i].getType ().equals ( HouseEquipmentType.MULTICOOKER )) {

                Shop tempShop = (Shop) shop;
                ShopSection tempSection = tempShop.getMulticookerSection ();
                HouseEquipment[] tempEquipments = tempSection.getEquipments ();

                tempSection.setEquipments ( ConvertArray.addElementsInArray ( tempEquipments, added[i] ) );
                tempShop.setMulticookerSection ( tempSection );

            } else {

                Shop tempShop = (Shop) shop;
                ShopSection tempSection = tempShop.getToastSection ();
                HouseEquipment[] tempEquipments = tempSection.getEquipments ();

                tempSection.setEquipments ( ConvertArray.addElementsInArray ( tempEquipments, added[i] ) );
                tempShop.setToastSection ( tempSection );
            }

            shop.getHouseEquipments ().addAll ( Arrays.asList ( added ) );
        }
    }
}
