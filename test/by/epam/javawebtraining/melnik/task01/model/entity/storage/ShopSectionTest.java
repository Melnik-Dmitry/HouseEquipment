package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopSectionTest {

	 private ShopSection defaultSection;
	 private HouseEquipment[] equipments;

	 @Before
	 public void setUp() throws Exception {
		  defaultSection = new ShopSection ();

		  equipments = new HouseEquipment[]{
					 CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE ),
					 CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER ),
					 CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST )
		  };
	 }

	 @Test
	 public void testFirstDefaultConstructor() {
		  assertNotEquals ( null, defaultSection.getEquipmentsInSection () );
	 }

	 @Test
	 public void testSecondDefaultConstructor() {
		  assertEquals ( 0, defaultSection.getEquipmentsInSection ().length );
	 }

	 @Test
	 public void TestConstructorWithNullLink() {
//		  ShopSection test = new ShopSection ( null );
//		  assertNotEquals ( null, test.getEquipmentsInSection () );
	 }

	 @Test
	 public void TestParametricConstructor() {
		  ShopSection test = new ShopSection ( equipments );

		  assertArrayEquals ( equipments, test.getEquipmentsInSection () );
	 }

	 @Test
	 public void testSetEquipments() throws InvalidParameterException {

		  defaultSection.setEquipmentsInSection ( equipments );
		  assertArrayEquals ( equipments, defaultSection.getEquipmentsInSection () );
	 }

    @Test (expected = InvalidParameterException.class)
    public void testNullLinkSetEquipments () throws InvalidParameterException {
        defaultSection.setEquipmentsInSection ( null);
    }

    @Test
	 public void testOneObject (){
	 	 assertEquals (true,defaultSection.equals ( defaultSection )  );
	 }

	 @Test
	 public void testEqualsObject (){
		  try {
				defaultSection.setEquipmentsInSection ( equipments );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }
		  ShopSection tested = new ShopSection ( equipments );

		  assertEquals (true,defaultSection.equals ( tested )  );
	 }

	 @Test
	 public void testEqualsWithNullObject (){
		  try {
				defaultSection.setEquipmentsInSection ( equipments );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertNotEquals (true,defaultSection.equals ( null )  );
	 }

	 @Test
	 public void testEqualsDiffObjects (){
		  try {
				defaultSection.setEquipmentsInSection ( equipments );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertNotEquals (true,defaultSection.equals ( new HouseEquipment (  ) )  );
	 }
}