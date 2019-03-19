package by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring.StringSplit;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Multicooker;

public class MulticookerCreator implements HouseEquipmentCreator {

	 @Override
	 public HouseEquipment makeHouseEquipment(String data) {
		  String[] dataArray = StringSplit.splitString ( data, " " );

		  HouseEquipment result = null;

		  result = new Multicooker ( Double.valueOf ( dataArray[0] ),
											  Double.valueOf ( dataArray[1] ),
											  Integer.valueOf ( dataArray[3] ) );

		  return result;
	 }
}
