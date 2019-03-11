package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertArrayEquals;

@RunWith(value = Parameterized.class)
public class SortHouseEquipmentTest {

	 private Building expectedIncrease;
	 private Building expectedDescend;
	 private Building building;

	 public SortHouseEquipmentTest(Building expectedIncrease, Building expectedDescend, Building building) {
		  this.expectedIncrease = expectedIncrease;
		  this.expectedDescend = expectedDescend;
		  this.building = building;
	 }

	 @Parameters
	 public static Building[][] data() {

		  HouseEquipment microwave1 = new HouseEquipment ( 1000, 700,
																			HouseEquipmentType.MICROWAWE );
		  HouseEquipment multicooker1 = new HouseEquipment ( 2000, 1300,
																			  HouseEquipmentType.MULTICOOKER );
		  HouseEquipment toast1 = new HouseEquipment ( 600, 420,
																	  HouseEquipmentType.TOAST );

		  HouseEquipment[] firstArray = {toast1, multicooker1, microwave1};
		  Building firstBuilding = new Building ( firstArray );

		  HouseEquipment[] secondArray = {multicooker1, toast1, microwave1};
		  Building secondBuilding = new Building ( secondArray );

		  HouseEquipment[] thirdArray = {toast1, microwave1, multicooker1};
		  Building expectedIncreasingBuilding = new Building ( thirdArray );

		  HouseEquipment[] fourthArray = {multicooker1, microwave1, toast1};
		  Building expectedDescendingBuilding = new Building ( fourthArray );

		  Building[][] data = {
					 {expectedIncreasingBuilding, expectedDescendingBuilding, firstBuilding},
					 {expectedIncreasingBuilding, expectedDescendingBuilding, secondBuilding}
		  };
		  return data;
	 }

	 @Test
	 public void testIncreasingSort() {
		  Sort sorting = new SortHouseEquipment ();

		  try {
				sorting.increasingSort ( building );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertArrayEquals ( expectedIncrease.getEquipments (), building.getEquipments () );
	 }

	 @Test (expected = InvalidParameterException.class)
	 public void testIncreasingSortWitNullLink() throws InvalidParameterException {
		  Sort sorting = new SortHouseEquipment ();
		  sorting.increasingSort ( null );
	 }

	 @Test
	 public void testDescendingSort () {
		  Sort sorting = new SortHouseEquipment ();

		  try {
				sorting.descendingSort ( building );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertArrayEquals ( expectedDescend.getEquipments (), building.getEquipments () );
	 }

	 @Test (expected = InvalidParameterException.class)
	 public void testDescendingSortWitNullLink() throws InvalidParameterException {
		  Sort sorting = new SortHouseEquipment ();
		  sorting.descendingSort ( null );
	 }
}