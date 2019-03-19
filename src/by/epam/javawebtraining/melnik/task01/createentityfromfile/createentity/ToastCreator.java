package by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring.StringSplit;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Toast;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;

public class ToastCreator implements HouseEquipmentCreator {
	 @Override
	 public HouseEquipment makeHouseEquipment(String data) {

		  String[] dataArray = null;
		  try {
				dataArray = StringSplit.splitString ( data, " " );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  return new Toast ( Double.valueOf ( dataArray[0] ),
									Double.valueOf ( dataArray[1] ),
									Boolean.valueOf ( dataArray[3] ) );
	 }
}
