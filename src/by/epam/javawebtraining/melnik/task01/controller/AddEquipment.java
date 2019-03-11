package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArraysException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.ShopAssistant;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class AddEquipment {

	 public static void runAddElementsInBuildingWithException() {
		  Building shop = null;
		  try {
				shop = ShopCreator.createShopWithParameter
						  ( CreateArrayHouseEquipment.createArrayOfHouseEquipment ( 5 ) );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
				e.printStackTrace ();
		  }

		  Print printer = PrintCreator.createPrint ();
		  printer.print ( shop.toString () );

		  HouseEquipment addedEquipment = CreatorHouseEquipment.createHouseEquipment
					 ( RandomTypeOfHouseEquipment.makeHouseEquipmentType () );

		  try {
				ShopAssistant.addEquipmetInBuilding ( shop, addedEquipment );
		  } catch (EndArraysException e) {
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
	 }

	 public static void runAddElementsInBuilding() {
		  Building shop = null;
		  try {
				shop = ShopCreator.createShopWithParameter
						  ( CreateArrayHouseEquipment.createArrayOfHouseEquipment ( 5 ) );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
				e.printStackTrace ();
		  }

		  Print printer = PrintCreator.createPrint ();
		  printer.print ( shop.toString () );

		  HouseEquipment addedEquipment1 = CreatorHouseEquipment.createHouseEquipment
					 ( RandomTypeOfHouseEquipment.makeHouseEquipmentType () );
		  HouseEquipment addedEquipment2 = CreatorHouseEquipment.createHouseEquipment
					 ( RandomTypeOfHouseEquipment.makeHouseEquipmentType () );

		  try {
				ShopAssistant.addEquipmentInShopDynamic ( shop, addedEquipment1, addedEquipment2 );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  printer.print ( shop.toString () );
	 }
}
