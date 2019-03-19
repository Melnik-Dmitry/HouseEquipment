package by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;

import java.util.regex.Pattern;

public class HouseEquipmentArrayCreator {

	 public static HouseEquipment[] makeArray(String[] data) throws InvalidParameterException {

	 	 if (data == null){
	 	 	 throw new InvalidParameterException ( new NullLinkException () );
		 }

		  HouseEquipment[] array = new HouseEquipment[data.length];

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
