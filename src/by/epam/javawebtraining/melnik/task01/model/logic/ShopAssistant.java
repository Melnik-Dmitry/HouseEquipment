package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ShopSection;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArraysException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.convertarray.ConvertArray;
import by.epam.javawebtraining.melnik.task01.validation.CheckBuildingParameters;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

public class ShopAssistant {

//    public static void sortEquipmetForSectionWithDynamic(Building shop) throws InvalidParameterException {
//
//        new CheckBuildingParameters().IsNull(shop);
//
//        for (HouseEquipment equipment : shop.getEquipments()) {
//            if (equipment.getType().equals(HouseEquipmentType.MICROWAWE)) {
//
//                Shop tempShop = (Shop) shop;
//                ShopSection tempSection = ((Shop) shop).getMicrowaveSection();
//                HouseEquipment[] tempEquipments = tempSection.getEquipmentsInSection();
//
//                tempSection.setEquipmentsInSection(ConvertArray.addElementsInDynamicArray(tempEquipments, equipment));
//                tempShop.setMicrowaveSection(tempSection);
//
//
//            } else if (equipment.getType().equals(HouseEquipmentType.MULTICOOKER)) {
//
//                Shop tempShop = (Shop) shop;
//                ShopSection tempSection = tempShop.getMulticookerSection();
//                HouseEquipment[] tempEquipments = tempSection.getEquipmentsInSection();
//
//                tempSection.setEquipmentsInSection(ConvertArray.addElementsInDynamicArray(tempEquipments, equipment));
//                tempShop.setMulticookerSection(tempSection);
//
//            } else {
//
//                Shop tempShop = (Shop) shop;
//                ShopSection tempSection = tempShop.getToastSection();
//                HouseEquipment[] tempEquipments = tempSection.getEquipmentsInSection();
//
//                tempSection.setEquipmentsInSection(ConvertArray.addElementsInDynamicArray(tempEquipments, equipment));
//                tempShop.setToastSection(tempSection);
//
//            }
//        }
//    }

    private static void cleanSection(ShopSection section) {
        HouseEquipment[] equipmentsInSection = section.getEquipmentsInSection();
        for (int i = 0; i < equipmentsInSection.length; i++) {
            equipmentsInSection[i] = null;
        }
    }

    private static void addInSection(ShopSection section, HouseEquipment equipment) {
        HouseEquipment[] equipmentsInSection = section.getEquipmentsInSection();
        HouseEquipment[] tempEquipmentsInSection = new HouseEquipment[equipmentsInSection.length + 1];
        for (int i = 0; i < equipmentsInSection.length; i++) {
            tempEquipmentsInSection[i] = equipmentsInSection[i];
        }
        tempEquipmentsInSection[equipmentsInSection.length] = equipment;

        try {
            section.setEquipmentsInSection(tempEquipmentsInSection);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }

    private static void sortEquipmetForSection(Building shop) {
        HouseEquipment[] equipments = shop.getEquipments();

        cleanSection(((Shop) shop).getMicrowaveSection());
        cleanSection(((Shop) shop).getMulticookerSection());
        cleanSection(((Shop) shop).getToastSection());


        for (HouseEquipment equipment : equipments) {

            if (equipment.getType().equals(HouseEquipmentType.MICROWAWE)) {
                addInSection(((Shop) shop).getMicrowaveSection(), equipment);
            } else if (equipment.getType().equals(HouseEquipmentType.MULTICOOKER)) {
                addInSection(((Shop) shop).getMulticookerSection(), equipment);
            } else {
                addInSection(((Shop) shop).getToastSection(), equipment);
            }
        }
    }

    private static int amountNullEementsInArray(HouseEquipment[] equipments) {
        int result = 0;
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] == null) {
                result++;
            }
        }
        return result;
    }

    public static void addEquipmetInShop(Building shop, HouseEquipment... equipm)
            throws EndArraysException {


        HouseEquipment[] equipments = shop.getEquipments();
        if (equipm.length > amountNullEementsInArray(equipments)) {
            new ConsolePrint().print("We can add only " + amountNullEementsInArray(equipments) + " elements.");
        }
        int j = 0;
        for (int i = 0; i < equipments.length; i++) {

            if (equipments[i] == null) {
                equipments[i] = equipm[j];
                j++;
                if (j == equipm.length) {
                    return;
                }
            }


            if (equipments[equipments.length - 1] != null) {
                sortEquipmetForSection(shop);
                throw new EndArraysException();
            }
        }

        sortEquipmetForSection(shop);
    }

//    public static void addEquipmentInSection(Building shop, HouseEquipment... added) throws NullLinkException {
//
//        new CheckBuildingParameters ().IsNull ( shop );
//
//        for (int i = 0; i < added.length; i++) {
//            if (added[i].getType ().equals ( HouseEquipmentType.MICROWAWE )) {
//                Shop tempShop = (Shop) shop;
//                ShopSection tempSection = tempShop.getMicrowaveSection ();
//                HouseEquipment[] tempEquipments = tempSection.getEquipmentsInSection ();
//
//                tempSection.setEquipmentsInSection ( ConvertArray.addElementsInDynamicArray ( tempEquipments, added[i] ) );
//                tempShop.setMicrowaveSection ( tempSection );
//            } else if (added[i].getType ().equals ( HouseEquipmentType.MULTICOOKER )) {
//
//                Shop tempShop = (Shop) shop;
//                ShopSection tempSection = tempShop.getMulticookerSection ();
//                HouseEquipment[] tempEquipments = tempSection.getEquipmentsInSection ();
//
//                tempSection.setEquipmentsInSection ( ConvertArray.addElementsInDynamicArray ( tempEquipments, added[i] ) );
//                tempShop.setMulticookerSection ( tempSection );
//
//            } else {
//
//                Shop tempShop = (Shop) shop;
//                ShopSection tempSection = tempShop.getToastSection ();
//                HouseEquipment[] tempEquipments = tempSection.getEquipmentsInSection ();
//
//                tempSection.setEquipmentsInSection ( ConvertArray.addElementsInDynamicArray ( tempEquipments, added[i] ) );
//                tempShop.setToastSection ( tempSection );
//            }
//
//            shop.getEquipments ().addAll ( Arrays.asList ( added ) );
//        }
//    }
}
