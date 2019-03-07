package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTest {

	 private Building defaultBuilding;
	 private Building parametricBuilding;

	 @Before
	 public void setUp() throws Exception {
		  defaultBuilding = new Building ();

		  HouseEquipment microwave = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );
		  HouseEquipment multicooker = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER );
		  HouseEquipment toast = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST );
		  HouseEquipment[] firstListEquipments = {microwave, multicooker, toast};

		  parametricBuilding = new Building ( firstListEquipments );
	 }
//
//
//
//
//		  secondArray = firstListEquipments;
//
////		  ty = {
//		  		  1,
//
//
//		  };

//		  thirdArray = new {
//
//		  CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE ),
//					 CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER ),
//					 CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST )
//	 };


//	 }

	 @Test
	 public void testFirstDefaultConstructor() {

		  assertNotEquals ( null, defaultBuilding.getEquipments () );
	 }

	 @Test
	 public void testSecondDefaultConstructor() {

		  assertEquals ( 10, defaultBuilding.getEquipments ().length );
	 }

	 @Test
	 public void testConstructorWithNull() {
		  Building tested = new Building ( null );
		  assertEquals ( defaultBuilding.getEquipments ().length, tested.getEquipments ().length );
	 }

	 @Test
	 public void testFirstParametricConstructor() {
	 	 assertNotEquals ( null, parametricBuilding.getEquipments () );
	 }

	 @Test
	 public void testSecondParametricConstructor() {
		  assertEquals ( 3, parametricBuilding.getEquipments ().length );
	 }


    @Test
    public void testFirstGetHouseEquipments() {
        assertNotEquals ( null, parametricBuilding.getEquipments () );
    }

	 @Test
	 public void testSecondGetHouseEquipments() {
		  assertEquals ( 3, parametricBuilding.getEquipments ().length );
	 }

    @Test (expected = InvalidParameterException.class)
    public void testSetHouseEquipmentsWithExeption() throws InvalidParameterException {
        defaultBuilding.setEquipments ( null );
    }

	 @Test
	 public void testSetHouseEquipments() {
		  try {
				defaultBuilding.setEquipments ( parametricBuilding.getEquipments () );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
		  assertArrayEquals ( defaultBuilding.getEquipments (), parametricBuilding.getEquipments () );
	 }

    @Test
    public void testEqualsObject() {
		  try {
				defaultBuilding.setEquipments ( parametricBuilding.getEquipments () );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
        assertEquals ( true, parametricBuilding.equals (defaultBuilding) );
    }

    @Test
    public void testNotEqualsObject() {
        assertEquals ( false, parametricBuilding.equals ( defaultBuilding) );
    }

    @Test
    public void testEqualsWithNull() {
        assertEquals ( false, parametricBuilding.equals ( null) );
    }

    @Test
    public void testEqualsOneObject() {
        assertEquals ( true, parametricBuilding.equals ( parametricBuilding) );
    }

	 @Test
	 public void testEqualsDiffObjects () {
		  assertEquals ( false, parametricBuilding.equals ( new HouseEquipment ()) );
	 }

    @Test
    public void testHashCodeEqualsObject () {
		  try {
				defaultBuilding.setEquipments ( parametricBuilding.getEquipments () );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertEquals ( parametricBuilding.hashCode (), defaultBuilding.hashCode () );
    }

    @Test
    public void testHashCodeNotEqualsObject () {
        assertNotEquals ( parametricBuilding.hashCode (), defaultBuilding.hashCode () );
    }
}