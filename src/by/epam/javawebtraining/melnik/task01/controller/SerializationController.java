package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.serialization.ProjectDeSerialization;
import by.epam.javawebtraining.melnik.task01.serialization.ProjectSerialization;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class SerializationController {

	 public static void runSerializationController() {

		  HouseEquipment[] equipments = null;
		  try {
				equipments = CreateArrayHouseEquipment.createArrayOfHouseEquipment ( 5 );
		  } catch (MethodParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }

		  String filePath = "D:\\HouseEquipment\\src\\entitySerializationFile.txt";

		  new ProjectSerialization<HouseEquipment> ().writeProjectEntityArray ( filePath, equipments );

		  HouseEquipment[] readedEquipments = new ProjectDeSerialization<HouseEquipment> ().
					 readProjectEntityArray ( filePath );

		  for (int i = 0; i < readedEquipments.length; i++) {
				new ConsolePrint ().print ( readedEquipments [i] + "" );
		  }
	 }
}
