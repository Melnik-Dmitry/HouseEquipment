package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;

public class SortHouseEquipment implements Sort {

	 @Override
	 public void sort (Building building) {
//		  Arrays.asList ( building.getEquipments () ).sort ( comparator );
//		  try {
//
//		  }
//		  catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
		  HouseEquipment [] equipments = building.getEquipments ();

		  for (int i = 0; i < equipments.length - 1; i++) {

				HouseEquipment min = equipments [i];

				for (int j = i + 1; j < equipments.length; j++) {
					 if (equipments[j].getTotalPower () < min.getTotalPower ()) {
						  min = equipments [j];
					 }
				}

				HouseEquipment tmp =min;
				equipments[i] = min;
				min = tmp;
		  }
	 }

	 public  void sort(int[] arr) {
		  for (int min = 0; min < arr.length - 1; min++) {
				int least = min;
				for (int j = min + 1; j < arr.length; j++) {
					 if (arr[j] < arr[least]) {
						  least = j;
					 }
				}
				int tmp = arr[min];
				arr[min] = arr[least];
				arr[least] = tmp;
		  }
	 }

}
