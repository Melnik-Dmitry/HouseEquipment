package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower.SearchParameterTotalEnergy;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class ControllerSearchPower {

	 public static void runSearchPower() {

		  Building shop = null;
		  try {
				shop = ShopCreator.createShopWithParameter
						  ( CreateArrayHouseEquipment.createArrayOfHouseEquipment ( 5 ) );
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }

		  Print printer = PrintCreator.createPrint ();
		  printer.print ( shop.toString () );

		  try {
				printer.print ( "Max total energy in shop- " );
				printer.print ( (new SearchParameterTotalEnergy ().takeEquipmentWithMaxPower ( shop )).toString () );
				printer.print ( "Min total energy in shop - " );
				printer.print ( (new SearchParameterTotalEnergy ().takeEquipmentWithMinPower ( shop )).toString () );
		  } catch (EmptyListException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }
	 }
}
