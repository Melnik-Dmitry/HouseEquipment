package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.sorting.SortHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class ControllerSort {

	 public static void runSortHouseEquipment() {
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
				new SortHouseEquipment ().increasingSort ( shop );
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }
		  printer.print ( "Increasing sort in shop - " );
		  printer.print ( shop.toString () );

		  try {
				new SortHouseEquipment ().descendingSort ( shop );
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }
		  printer.print ( "Descending sort in shop - " );
		  printer.print ( shop.toString () );
	 }
}
