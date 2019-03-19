package by.epam.javawebtraining.melnik.task01.createentityfromfile.validation;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.HouseEquipmentValidator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.MicrowaveValidator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.MulticookerValidator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.ToastValidator;

import java.util.ArrayList;
import java.util.List;

public class MakeValidHouseEquipmentData {

	 public static String[] makeValidDate(String[] checkedArray) {
		  List<String> array = new ArrayList<> ();

		  HouseEquipmentValidator microwaveValidator = new MicrowaveValidator ();
		  HouseEquipmentValidator multicookerValidator = new MulticookerValidator ();
		  HouseEquipmentValidator toastValidator = new ToastValidator ();

		  for (int i = 0; i < checkedArray.length; i++) {
				if (microwaveValidator.check ( checkedArray[i] )
						  || multicookerValidator.check ( checkedArray[i] )
						  || toastValidator.check ( checkedArray[i] )) {
					 array.add ( checkedArray[i] );
				}
		  }

		  return array.toArray ( new String[array.size ()] );
	 }
}
