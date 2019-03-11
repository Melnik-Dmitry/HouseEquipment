package by.epam.javawebtraining.melnik.task01.model.logic.convertarray;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;

public class ConvertArray {

	 public static HouseEquipment[] addElementsInDynamicArray
				(HouseEquipment[] equipments, HouseEquipment... addedElements) throws InvalidParameterException {

		  new CheckBuildingParameters ().IsNull ( equipments );

		  HouseEquipment[] tempArray = new HouseEquipment[equipments.length + addedElements.length];

		  for (int i = 0; i < equipments.length; i++) {
				tempArray[i] = equipments[i];
		  }

		  int w = 0;
		  for (int j = equipments.length; j < tempArray.length; j++) {
				tempArray[j] = addedElements[w];
				w++;
		  }
		  return tempArray;
	 }

	 public static HouseEquipment[] addElementsChangingAllNullElements
				(HouseEquipment[] equipments, HouseEquipment... addedElements) throws InvalidParameterException {

		  new CheckBuildingParameters ().IsNull ( equipments );

		  HouseEquipment[] tempArray = new HouseEquipment[equipments.length + addedElements.length];

		  int w = 0;
		  for (int i = 0; i < equipments.length; i++) {
				if (equipments[i] != null) {
					 tempArray[i] = equipments[i];
				} else {
					 tempArray[i] = addedElements[w];
					 w++;
				}
		  }

		  for (int j = equipments.length; j < tempArray.length; j++) {
				tempArray[j] = addedElements[w];
				w++;
		  }
		  return tempArray;
	 }
}
