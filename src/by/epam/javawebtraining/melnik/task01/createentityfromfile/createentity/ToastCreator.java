package by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring.StringSplit;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Toast;

public class ToastCreator implements HouseEquipmentCreator {
	 @Override
	 public HouseEquipment makeHouseEquipment(String data) {
		  String[] dataArray = StringSplit.splitString ( data, " " );

		  HouseEquipment result = null;

		  result = new Toast ( Double.valueOf ( dataArray[0] ),
									  Double.valueOf ( dataArray[1] ),
									  Boolean.valueOf ( dataArray[3] ) );

		  return result;
	 }
}
