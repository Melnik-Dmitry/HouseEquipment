package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.FileEquipmentReader;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity.HouseEquipmentArrayCreator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring.StringSplit;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.MakeValidHouseEquipmentData;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.io.IOException;

public class CreateEntityFromFileController {

	 public static void runController() {

		  String fromFile = "";

		  try {
				fromFile = FileEquipmentReader.readFile
						  ( "D:\\Java\\EPAM\\WebTraining\\HouseEquipment\\src\\by\\epam\\javawebtraining\\melnik\\task01\\createentityfromfile\\HouseEquipmentsFile.txt" );
		  } catch (IOException e) {
				e.printStackTrace ();
		  }

		  String[] validData = MakeValidHouseEquipmentData.makeValidDate
					 ( StringSplit.splitString ( fromFile, "\\." ) );

		  HouseEquipment[] equipments = HouseEquipmentArrayCreator.makeArray ( validData );

		  for (int i = 0; i < equipments.length; i++) {
				new ConsolePrint ().print ( equipments[i] + "" );
		  }
	 }
}
