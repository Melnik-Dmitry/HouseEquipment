package by.epam.javawebtraining.melnik.task01.util.createhouseequipment;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;

public class CreateArrayHouseEquipment {

	 public static HouseEquipment[] createArrayOfHouseEquipment(int arrayLength)
			 throws MethodParameterException {

		  if (arrayLength <= 0) {
				throw new MethodParameterException();
		  }

		  HouseEquipment[] array = new HouseEquipment[arrayLength];
		  for (int i = 0; i < arrayLength; i++) {
				array[i] = CreatorHouseEquipment.createHouseEquipment
						  ( RandomTypeOfHouseEquipment.makeHouseEquipmentType () );
		  }

		  return array;
	 }
}