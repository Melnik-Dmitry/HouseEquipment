package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.ProjectFileReader;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.createentity.HouseEquipmentArrayCreator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring.StringSplit;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.MakeValidHouseEquipmentData;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.MicrowaveValidator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.MulticookerValidator;
import by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation.ToastValidator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class CreateEntityFromFileController {

	 public static void runController() {

		  String fromFile = "";

		  fromFile = ProjectFileReader.readFile
					 ( "D:\\HouseEquipment\\src\\by\\epam\\javawebtraining\\melnik\\task01\\createentityfromfile\\HouseEquipmentsFile.txt" );

		  String[] splitDatafromFile = null;
		  String[] validData = null;
		  HouseEquipment[] equipments = null;

		  try {
				splitDatafromFile = StringSplit.splitString ( fromFile, "\\." );

				validData = MakeValidHouseEquipmentData.makeValidDate
						  ( splitDatafromFile,
							 new MicrowaveValidator (), new MulticookerValidator (), new ToastValidator () );

				equipments = HouseEquipmentArrayCreator.makeArray ( validData );
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }

		  for (int i = 0; i < equipments.length; i++) {
				new ConsolePrint ().print ( equipments[i] + "" );
		  }
	 }
}
