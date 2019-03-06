package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.validation.CheckBuildingParameters;

public class PowerBuildingEquipmentControl implements PowerControl {

	 @Override
	 public double deemPowerConsumption(Building building)
				throws EmptyListException, InvalidParameterException {

		  new CheckBuildingParameters ().IsNull ( building );
		  new CheckBuildingParameters ().isEmpty ( building.getEquipments () );

		  double result = 0;
		  for (HouseEquipment he : building.getEquipments ()) {
				if (he == null) {
					 continue;
				}
				if (he.getIsTurningOn ()) {
					 result += he.getPowerConsumption ();
				}
		  }
		  return result;
	 }

	 @Override
	 public double deemTotalPower(Building building)
				throws EmptyListException, InvalidParameterException {

		  new CheckBuildingParameters ().IsNull ( building );
		  new CheckBuildingParameters ().isEmpty ( building.getEquipments () );

		  double result = 0;
		  for (HouseEquipment he : building.getEquipments ()) {
				if (he == null) {
					 continue;
				}
				result += he.getTotalPower ();
		  }
		  return result;
	 }
}
