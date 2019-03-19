package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.FlatsNumberException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.logic.powercontrol.PowerBuildingEquipmentControl;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatOwnerCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class ControllerPowerControl {

	 public static void runPowerBuildingEquipmentControl() {
		  Building flat = null;
		  FlatOwner owner = null;
		  Building shop = null;
		  try {
				flat = FlatCreator.createFlatWithParameters ( 10 );
				owner = FlatOwnerCreator.createFlatOwnerWithParameters ( "Melnik", flat );
				shop = ShopCreator.createShopWithParameter
						  ( CreateArrayHouseEquipment.createArrayOfHouseEquipment ( 5 ) );
		  } catch (FlatsNumberException e) {
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (FlatOwnerSurnameException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }

		  Print printer = PrintCreator.createPrint ();
		  printer.print ( shop.toString () );

		  try {
				HouseEquipment[] temp = owner.buyHouseEquipment ( 3, shop );
				owner.addAllHouseEquipmentInFlat ( temp );
		  } catch (EmptyListException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }

		  printer.print ( flat.toString () );

		  for (int i = 0; i < flat.getEquipments ().length; i++) {
				if (flat.getEquipments ()[i] == null) {
					 continue;
				}
				flat.getEquipments ()[i].turnOn ();
		  }

		  try {
				printer.print ( new PowerBuildingEquipmentControl ().deemTotalPower ( flat ) + "" );
				printer.print ( new PowerBuildingEquipmentControl ().deemPowerConsumption ( flat ) + "" );
		  } catch (EmptyListException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  }
	 }
}
