package by.epam.javawebtraining.melnik.task01.model.logic.conversionarray;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.checkparameter.CheckBuildingParameters;

public class ConversionArray {

    public static HouseEquipment[] addElements
            (HouseEquipment[] equipments, HouseEquipment... addedElements) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(equipments);
        HouseEquipment[] tempArray = new HouseEquipment[equipments.length];

        int w = 0;
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] != null) {
                tempArray[i] = equipments[i];
            } else {
                if (w == addedElements.length) {
                    continue;
                }
                tempArray[i] = addedElements[w];
                w++;
            }
        }

        return tempArray;
    }

    public static HouseEquipment[] addElementsIncreaseArray
            (HouseEquipment[] equipments, HouseEquipment... addedElements) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(equipments);
        HouseEquipment[] tempArray = new HouseEquipment[equipments.length];

        int w = 0;
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] != null) {
                tempArray[i] = equipments[i];
            } else {
                if (w == addedElements.length) {
                    continue;
                }
                tempArray[i] = addedElements[w];
                w++;
            }
        }

        HouseEquipment[] returnedArray = new HouseEquipment[tempArray.length + (addedElements.length - w)];
        for (int i = 0; i < tempArray.length; i++) {
            returnedArray[i] = tempArray[i];
        }

        for (int i = tempArray.length; i < returnedArray.length; i++) {
            returnedArray[i] = addedElements[w];
            w++;
        }

        return returnedArray;
    }
}
