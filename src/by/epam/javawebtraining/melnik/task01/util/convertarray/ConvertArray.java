package by.epam.javawebtraining.melnik.task01.util.convertarray;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

public class ConvertArray {


    public static HouseEquipment[] addElementsInArray(HouseEquipment[] equipments, HouseEquipment... addedElements) {

        HouseEquipment[] tempArray = new HouseEquipment[equipments.length + addedElements.length];

        for (int i = 0; i < tempArray.length; i++) {
            if (i < equipments.length) {
                tempArray[i] = equipments[i];
            }
        }
        for (int j = equipments.length; j < tempArray.length; j++) {
            int w = 0;
            tempArray[j] = addedElements[w];
            w++;
        }
        return tempArray;
    }
//
//    public static HouseEquipment[] addElementsInBuilding(ComercialBuilding comemercialBuilding,
//                                                         HouseEquipment... addedElements) {
//
//        HouseEquipment[] startArray = (HouseEquipment[]) comemercialBuilding.getHouseEquipments ().toArray ();
//
//        HouseEquipment[] tempArray = new HouseEquipment[startArray.length + addedElements.length];
//
//        for (int i = 0; i < tempArray.length; i++) {
//            if (i < startArray.length) {
//                tempArray[i] = startArray[i];
//            }
//        }
//        for (int j = startArray.length; j < tempArray.length; j++) {
//            int w = 0;
//            tempArray[j] = addedElements[w];
//            w++;
//        }
//        return tempArray;
//    }
}
