package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.FlatsNumberException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArraysException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.logic.ShopAssistant;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower.SearchParameterTotalEnergy;
import by.epam.javawebtraining.melnik.task01.model.logic.powercontrol.PowerBuildingEquipmentControl;
import by.epam.javawebtraining.melnik.task01.model.logic.sorting.SortHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreateArrayHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter.RandomTypeOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatOwnerCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.ShopCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class appController {
	 public static void main(String[] args) {

//		  runSearchPower ();
//		  runAddElementsInShopWithException();
//		  runAddElementsInShop ();
//		  runPowerControl ();
		  sorting ();
	 }


	 public static void runSearchPower() {

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

		  try {
				printer.print ( (new SearchParameterTotalEnergy ().takeEquipmentWithMaxPower ( shop )).toString () );
				printer.print ( (new SearchParameterTotalEnergy ().takeEquipmentWithMinPower ( shop )).toString () );
		  } catch (EmptyListException e) {
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
	 }

	 public static void runAddElementsInShopWithException() {
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
				ShopAssistant.addEquipmetInShop ( shop, addedEquipment );
		  } catch (EndArraysException e) {
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
			  e.printStackTrace();
		  }
	 }

	 public static void runAddElementsInShop() {
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

	 public static void runPowerControl() {
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
				e.printStackTrace ();
		  } catch (FlatOwnerSurnameException e) {
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
				e.printStackTrace ();
		  }

		  Print printer = PrintCreator.createPrint ();
		  printer.print ( shop.toString () );

		  try {
				HouseEquipment[] temp = owner.buyHouseEquipment ( 3, shop );
				owner.addAllHouseEquipmentInFlat ( temp );
		  } catch (EmptyListException e) {
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  } catch (MethodParameterException e) {
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
				e.printStackTrace ();
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
	 }

	 public static void sorting (){
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

		 try {
			 new SortHouseEquipment ().increasingSort ( shop );
		 } catch (InvalidParameterException e) {
			 e.printStackTrace();
		 }
		 printer.print ( shop.toString () );

		 try {
			 new SortHouseEquipment ().descendingSort ( shop );
		 } catch (InvalidParameterException e) {
			 e.printStackTrace();
		 }
		 printer.print ( shop.toString () );

	 }
}

