package by.epam.javawebtraining.melnik.task01.util.createhouseequipment;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.*;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomAmountOfProgram;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomInnerVolume;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTotalPower;

public class CreatorHouseEquipment {

	 public static HouseEquipment createHouseEquipment(HouseEquipmentType houseEquipmentType) {

		  double totalPower = new RandomTotalPower ().makeValueParameter ();
		  double powerConsumption = 0.7 * totalPower;
		  int amountOfProgram = new RandomAmountOfProgram ().makeValueParameter ();
		  int innerVolume = new RandomInnerVolume ().makeValueParameter ();

		  HouseEquipment houseEquipment = null;

		  switch (houseEquipmentType) {
				case MICROWAWE:
					 houseEquipment = new Microwave ( totalPower, powerConsumption, innerVolume );
					 break;
				case MULTICOOKER:
					 houseEquipment = new Multicooker ( totalPower, powerConsumption, amountOfProgram );
					 break;
				case TOAST:
					 houseEquipment = new Toast ( totalPower, powerConsumption, false );
					 break;
		  }

		  return houseEquipment;
	 }
}
