package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.PowerConsumptionEquipmentException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.TotalEnergyEquipmentExeption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HouseEquipmentTest {

	 private HouseEquipment firstEquipment;
	 private HouseEquipment secondEquipment;

	 @Before
	 public void setUp() throws Exception {
		  firstEquipment = new HouseEquipment ( 1000, 700,
															 HouseEquipmentType.MICROWAWE );
		  secondEquipment = new HouseEquipment ( 900, 600,
															  HouseEquipmentType.MICROWAWE );

	 }

	 @Test
	 public void testFirstInvalidTotalPowerInConstructor() {
		  HouseEquipment defaultEquipment = new HouseEquipment ( 1000, 0,
																					HouseEquipmentType.MICROWAWE );
		  HouseEquipment testEquipment = new HouseEquipment ( 300, 1000 * 0.7,
																				HouseEquipmentType.MICROWAWE );

		  assertEquals ( defaultEquipment, testEquipment );
	 }

	 @Test
	 public void testSecondInvalidTotalPowerInConstructor() {
		  HouseEquipment defaultEquipment = new HouseEquipment ();
		  HouseEquipment testEquipment = new HouseEquipment ( 2600, 1000,
																				HouseEquipmentType.MICROWAWE );

		  assertEquals ( defaultEquipment, testEquipment );
	 }

	 @Test
	 public void testFirstInvalidPowerConsumptionInConstructor() {
		  HouseEquipment defaultEquipment = new HouseEquipment ();
		  HouseEquipment testEquipment = new HouseEquipment ( 1000, 1000 * 0.4,
																				HouseEquipmentType.MICROWAWE );

		  assertEquals ( defaultEquipment, testEquipment );
	 }

	 @Test
	 public void testSecondInvalidPowerConsumptionInConstructor() {
		  HouseEquipment defaultEquipment = new HouseEquipment ();
		  HouseEquipment testEquipment = new HouseEquipment ( 1000, 1000 * 0.8,
																				HouseEquipmentType.MICROWAWE );

		  assertEquals ( defaultEquipment, testEquipment );
	 }

	 @Test
	 public void getTotalPower() {
		  assertEquals ( 1000, firstEquipment.getTotalPower (), 0.01 );
	 }

	 @Test
	 public void getPowerConsumption() {
		  assertEquals ( 700, firstEquipment.getPowerConsumption (), 0.01 );
	 }

	 @Test
	 public void getIsTurningOn() {
		  assertEquals ( false, firstEquipment.getIsTurningOn () );
	 }

	 @Test
	 public void setTotalPower() {
		  double expected = 900;
		  try {
				firstEquipment.setTotalPower ( 900 );
		  } catch (TotalEnergyEquipmentExeption totalEnergyEquipmentExeption) {
				totalEnergyEquipmentExeption.printStackTrace ();
		  }

		  assertEquals ( expected, firstEquipment.getTotalPower (), 0.01 );
	 }

	 @Test(expected = TotalEnergyEquipmentExeption.class)
	 public void firstInvalidParameterSetTotalPower() throws TotalEnergyEquipmentExeption {
		  firstEquipment.setTotalPower ( 400 );
	 }

	 @Test(expected = TotalEnergyEquipmentExeption.class)
	 public void secondInvalidParameterSetTotalPower() throws TotalEnergyEquipmentExeption {
		  firstEquipment.setTotalPower ( 2600 );
	 }

	 @Test
	 public void setPowerConsumption() throws PowerConsumptionEquipmentException {
		  firstEquipment.setPowerConsumption ( 600 );

		  assertEquals ( 600, firstEquipment.getPowerConsumption (), 0.1 );
	 }

	 @Test(expected = PowerConsumptionEquipmentException.class)
	 public void firstInvalidSetPowewrConsumption() throws PowerConsumptionEquipmentException {

		  firstEquipment.setPowerConsumption ( 1000 * 0.4 );
	 }

	 @Test(expected = PowerConsumptionEquipmentException.class)
	 public void secondInvalidSetPowewrConsumption() throws PowerConsumptionEquipmentException {

		  firstEquipment.setPowerConsumption ( 1000 * 0.8 );
	 }

	 @Test
	 public void setIsTurningOn() {
		  firstEquipment.setIsTurningOn ( true );
		  assertEquals ( true, firstEquipment.getIsTurningOn () );
	 }

	 @Test
	 public void firstTestEquals() {

		  try {
				firstEquipment.setTotalPower ( 900 );
				firstEquipment.setPowerConsumption ( 600 );
		  } catch (PowerConsumptionEquipmentException e) {
				e.printStackTrace ();
		  } catch (TotalEnergyEquipmentExeption totalEnergyEquipmentExeption) {
				totalEnergyEquipmentExeption.printStackTrace ();
		  }

		  assertEquals ( true, firstEquipment.equals ( secondEquipment ) );
	 }

	 @Test
	 public void secondTestEquals() {
		  assertNotEquals ( true, firstEquipment.equals ( secondEquipment ) );
	 }

	 @Test
	 public void testEqualsWithNullLink() {
		  assertNotEquals ( true, firstEquipment.equals ( null ) );
	 }

	 @Test
	 public void testEqualsDifferentObject() {
		  assertNotEquals ( true, firstEquipment.equals ( new Object () ) );
	 }

	 @Test
	 public void testObjectsWithDiffHashCode() {
		  assertNotEquals ( firstEquipment.hashCode (), secondEquipment.hashCode () );
	 }

	 @Test
	 public void testObjectsWithEqualHashCode() {
		  try {
				firstEquipment.setTotalPower ( 900 );
				firstEquipment.setPowerConsumption ( 600 );
		  } catch (TotalEnergyEquipmentExeption totalEnergyEquipmentExeption) {
				totalEnergyEquipmentExeption.printStackTrace ();
		  } catch (PowerConsumptionEquipmentException e) {
				e.printStackTrace ();
		  }

		  assertEquals ( firstEquipment.hashCode (), secondEquipment.hashCode () );
	 }

	 @Test
	 public void turnOn() {
		  firstEquipment.turnOn ();

		  assertEquals ( true, firstEquipment.getIsTurningOn () );
	 }

	 @Test
	 public void turnOff() {
		  firstEquipment.turnOff ();

		  assertEquals ( false, firstEquipment.getIsTurningOn () );
	 }
}