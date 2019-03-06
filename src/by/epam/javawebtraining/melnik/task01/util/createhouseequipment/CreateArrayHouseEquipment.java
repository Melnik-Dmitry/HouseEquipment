package by.epam.javawebtraining.melnik.task01.util.createhouseequipment;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;

public class CreateArrayHouseEquipment {

	 public static HouseEquipment[] createArrayOfHouseEquipment(int arraysLength)
			 throws MethodParameterException {

		  if (arraysLength <= 0) {
				throw new MethodParameterException();
		  }

		  HouseEquipment[] array = new HouseEquipment[arraysLength];
		  for (int i = 0; i < arraysLength; i++) {
				array[i] = CreatorHouseEquipment.createHouseEquipment
						  ( RandomTypeOfHouseEquipment.makeHouseEquipmentType () );
		  }

		  return array;
	 }
}