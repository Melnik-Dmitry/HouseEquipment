package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

	 private Shop defaultShop;

	 @Before
	 public void setUp() throws Exception {
		  defaultShop = new Shop ();
	 }

	 @Test
	 public void testFirsDefaultConstructor() {

		  assertNotNull ( defaultShop.getMicrowaveSection () );
		  assertNotNull ( defaultShop.getMulticookerSection () );
		  assertNotNull ( defaultShop.getToastSection () );
	 }

	 @Test
	 public void testGetMicrowaveSection() {
		  assertNotNull ( defaultShop.getMicrowaveSection () );
	 }

	 @Test
	 public void testGetMulticookerSection() {
		  assertNotNull ( defaultShop.getMulticookerSection () );
	 }

	 @Test
	 public void testGetToastSection() {
		  assertNotNull ( defaultShop.getToastSection () );
	 }

	 @Test
	 public void testSetMicrowaveSection() {

		  ShopSection section = new ShopSection ();
		  try {
				defaultShop.setMicrowaveSection ( section );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertEquals ( section, defaultShop.getMicrowaveSection () );
	 }

	 @Test(expected = InvalidParameterException.class)
	 public void testSetMicrowaveSectionWithnull() throws InvalidParameterException {
		  defaultShop.setMicrowaveSection ( null );
	 }

	 @Test
	 public void testSetMulticookerSection() {

		  ShopSection section = new ShopSection ();
		  try {
				defaultShop.setMulticookerSection ( section );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertEquals ( section, defaultShop.getMicrowaveSection () );
	 }

	 @Test(expected = InvalidParameterException.class)
	 public void testSetMulticookerSectionWithnull() throws InvalidParameterException {
		  defaultShop.setMulticookerSection ( null );
	 }

	 @Test
	 public void testSetToastSection() {

		  ShopSection section = new ShopSection ();
		  try {
				defaultShop.setToastSection ( section );
		  } catch (InvalidParameterException e) {
				e.printStackTrace ();
		  }

		  assertEquals ( section, defaultShop.getMicrowaveSection () );
	 }

	 @Test(expected = InvalidParameterException.class)
	 public void testSetToastSectionWithnull() throws InvalidParameterException {
		  defaultShop.setToastSection ( null );
	 }
}