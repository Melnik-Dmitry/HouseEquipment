package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;

public class SortHouseEquipment implements Sort {

	 @Override
	 public void increasingSort(Building building) {
//		  Arrays.asList ( building.getEquipments () ).increasingSort ( comparator );
//		  try {
//
//		  }
//		  catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }

		  HouseEquipment[] equipments = building.getEquipments ();

		  for (int i = 0; i < equipments.length - 1; i++) {

				HouseEquipment min = equipments[i];
				int index = i;
				for (int j = i + 1; j < equipments.length; j++) {
					 if (equipments[j].getTotalPower () < min.getTotalPower ()) {
						  min = equipments[j];
						  index = j;
					 }
				}
				if (i != index) {
					 HouseEquipment temp = equipments[i];
					 equipments[i] = min;
					 equipments[index] = temp;
				}
		  }

		  try {
				building.setEquipments ( equipments );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
	 }

	 @Override
	 public void descendingSort(Building building) {
		  HouseEquipment[] equipments = building.getEquipments ();

		  for (int i = 0; i < equipments.length - 1; i++) {

				HouseEquipment min = equipments[i];
				int index = i;
				for (int j = i + 1; j < equipments.length; j++) {
					 if (equipments[j].getTotalPower () > min.getTotalPower ()) {
						  min = equipments[j];
						  index = j;
					 }
				}
				if (i != index) {
					 HouseEquipment temp = equipments[i];
					 equipments[i] = min;
					 equipments[index] = temp;
				}
		  }

		  try {
				building.setEquipments ( equipments );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
	 }


	 public static void sort(int[] arr) {
		  for (int i = 0; i < arr.length; i++) {

				int min = arr[i];

				int index = i;
				for (int j = i + 1; j < arr.length; j++) {
					 if (arr[j] < min) {
						  min = arr[j];
						  index = j;
					 }
				}

				if (i != index) {
					 int tmp = arr[i];
					 arr[i] = min;
					 arr[index] = tmp;
				}


		  }
	 }
}
