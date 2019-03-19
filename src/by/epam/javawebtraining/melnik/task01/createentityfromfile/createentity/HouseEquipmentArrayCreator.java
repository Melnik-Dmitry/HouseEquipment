package by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;

import java.util.regex.Pattern;

public class HouseEquipmentArrayCreator {

	 public static HouseEquipment[] makeArray(String[] data) {
		  HouseEquipment[] array = new HouseEquipment[data.length];

//		  Pattern microwavePattern = Pattern.compile ( "MICROWAVE" );
//		  Pattern multicookerPattern = Pattern.compile ( "MULTICOOKER" );
//		  Pattern toastPattern = Pattern.compile ("TOAST");

//		  Matcher cv1 = microwavePattern.matcher ( data[i] );
		  for (int i = 0; i < data.length; i++) {
				if (Pattern.compile ( "MICROWAVE" ).matcher ( data[i] ).find ()) {
					 array[i] = new MicrowaveCreator ().makeHouseEquipment ( data[i] );

				} else if (Pattern.compile ( "MULTICOOKER" ).matcher ( data[i] ).find ()) {
					 array[i] = new MulticookerCreator ().makeHouseEquipment ( data[i] );

				} else if (Pattern.compile ( "TOAST" ).matcher ( data[i] ).find ()) {
					 array[i] = new ToastCreator ().makeHouseEquipment ( data[i] );
				}
		  }
		  return array;
	 }
}
