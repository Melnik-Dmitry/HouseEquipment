package by.epam.javawebtraining.melnik.task01.util.convertarray;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckBuildingParameters;

public class ConvertArray {


    public static HouseEquipment[] addElementsInDynamicArray
            (HouseEquipment[] equipments, HouseEquipment... addedElements) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(equipments);

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
}
