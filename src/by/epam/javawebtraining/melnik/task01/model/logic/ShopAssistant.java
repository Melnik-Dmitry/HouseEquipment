package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ShopSection;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArrayException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.convertarray.ConversionArray;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

public class ShopAssistant {

	 private static void cleanSection(ShopSection section) {
		  HouseEquipment[] equipmentsInSection = section.getEquipmentsInSection ();
		  for (int i = 0; i < equipmentsInSection.length; i++) {
				equipmentsInSection[i] = null;
		  }
	 }

	 private static void addInSection(ShopSection section, HouseEquipment equipment) {
		  HouseEquipment[] equipmentsInSection = section.getEquipmentsInSection ();
		  HouseEquipment[] tempEquipmentsInSection = new HouseEquipment[equipmentsInSection.length + 1];
		  for (int i = 0; i < equipmentsInSection.length; i++) {
				tempEquipmentsInSection[i] = equipmentsInSection[i];
		  }
		  tempEquipmentsInSection[equipmentsInSection.length] = equipment;

		  try {
				section.setEquipmentsInSection ( tempEquipmentsInSection );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
	 }

	 private static void sortEquipmetForSection(Building shop) {
		  HouseEquipment[] equipments = shop.getEquipments ();

		  cleanSection ( ((Shop) shop).getMicrowaveSection () );
		  cleanSection ( ((Shop) shop).getMulticookerSection () );
		  cleanSection ( ((Shop) shop).getToastSection () );


		  for (HouseEquipment equipment : equipments) {

				if (equipment.getType ().equals ( HouseEquipmentType.MICROWAWE )) {
					 addInSection ( ((Shop) shop).getMicrowaveSection (), equipment );
				} else if (equipment.getType ().equals ( HouseEquipmentType.MULTICOOKER )) {
					 addInSection ( ((Shop) shop).getMulticookerSection (), equipment );
				} else {
					 addInSection ( ((Shop) shop).getToastSection (), equipment );
				}
		  }
	 }

	 private static int amountNullElementsInArray(HouseEquipment[] equipments) {
		  int result = 0;
		  for (int i = 0; i < equipments.length; i++) {
				if (equipments[i] == null) {
					 result++;
				}
		  }
		  return result;
	 }

	 public static void addEquipmetInBuilding(Building shop, HouseEquipment... equipm)
			 throws EndArrayException, InvalidParameterException {

	 	new CheckBuildingParameters().IsNull(shop);

		  HouseEquipment[] equipments = shop.getEquipments ();
		  if (equipm.length > amountNullElementsInArray ( equipments )) {
				new ConsolePrint ().print ( "We can add only " + amountNullElementsInArray ( equipments ) + " elements." );
		  }
		  int j = 0;

		  for (int i = 0; i < equipments.length; i++) {
				if (equipments[i] == null) {
					 equipments[i] = equipm[j];
					 j++;
					 if (j == equipm.length) {
						  return;
					 }
				}

				if (equipments[equipments.length - 1] != null) {
					 sortEquipmetForSection ( shop );
					 throw new EndArrayException ();
				}
		  }

		  sortEquipmetForSection ( shop );
	 }

	 public static void addEquipmentInShopDynamic(Building shop, HouseEquipment... equipm)
				throws InvalidParameterException {

		  new CheckBuildingParameters ().IsNull ( shop );

		  HouseEquipment[] equipments = shop.getEquipments ();
		  HouseEquipment[] tempEquipments = ConversionArray.addElementsIncreaseArray ( equipments, equipm );

		  shop.setEquipments ( tempEquipments );
		  sortEquipmetForSection ( shop );
	 }
}
