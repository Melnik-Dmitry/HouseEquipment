package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArraysException;
import by.epam.javawebtraining.melnik.task01.model.logic.ShopAssistant;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;

import java.util.Arrays;

public class test {

	 public static void sort(int[] arr) {
		  for (int i = 0; i < arr.length - 1; i++) {
				int temp = i;
				for (int j = i + 1; j < arr.length; j++) {
					 if (arr[j] < arr[temp]) {
						  temp = j;
					 }
				}
				int tmp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = tmp;
		  }
	 }

	 public static void main(String[] args) {
//		  int[] rtr = new int[]{5, 2, 9, 1};
//
//
//		  increasingSort ( rtr );
//		  System.out.println ();

//		  HouseEquipment[] equipments = {
//					 CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE ),
//					 null,
//					 null
//		  };
//		  System.out.println ( Arrays.toString (  equipments));
		 HouseEquipment[] equipments = new HouseEquipment[10];

				 Building shop = new Shop(equipments);

		  HouseEquipment micro1 =  CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );
		  HouseEquipment micro2 =  CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );
		  HouseEquipment micro3 =  CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );

		 try {
			 ShopAssistant.addEquipmetInShop(shop, micro1, micro2, micro3);
		 } catch (EndArraysException e) {
			 e.printStackTrace();
		 }

		 System.out.println ( Arrays.toString (  shop.getEquipments()));
	 }



	 }

