package by.epam.javawebtraining.melnik.task01.createentityfromfile.validation;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.HouseEquipmentValidator;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;

import java.util.ArrayList;

public class MakeValidHouseEquipmentData {

	 public static String[] makeValidDate(String[] checkedArray, HouseEquipmentValidator... validators)
				throws InvalidParameterException {

		  if (checkedArray == null) {
				throw new InvalidParameterException ( new NullLinkException () );
		  }
		  if (validators.length == 0) {
				throw new InvalidParameterException ();
		  }
		  ArrayList<String> array = new ArrayList<> ();

		  for (int i = 0; i < checkedArray.length; i++) {
				for (int j = 0; j < validators.length; j++) {
					 if (validators[j].check ( checkedArray[i] )) {
						  array.add ( checkedArray[i] );
					 }
				}
		  }
		  array.trimToSize ();

		  return array.toArray ( new String[array.size ()] );
	 }
}
