package by.epam.javawebtraining.melnik.task01.comparator;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;

import java.util.Comparator;

public class EquipmentComparator implements Comparator<HouseEquipment> {

	 @Override
	 public int compare(HouseEquipment first, HouseEquipment second) {

		  if (first == null || second == null) {
				try {
					 throw new NullLinkException ();
				} catch (NullLinkException e) {
					 e.printStackTrace ();
				}
		  }
		  return (int) (first.getTotalPower () - second.getTotalPower ());
	 }
}
