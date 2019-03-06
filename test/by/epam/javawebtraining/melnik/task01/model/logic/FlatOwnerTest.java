package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
//import by.epam.javawebtraining.melnik.task01.model.entity.storage.Warehouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FlatOwnerTest {

	 private FlatOwner defaultOwner;
	 private FlatOwner testedOwner;
	 private Flat flat;

//	 @Before
//	 public void setUp() throws Exception {
//		  flat = new Flat ( 10 );
//		  defaultOwner = new FlatOwner ();
//		  testedOwner = new FlatOwner ( "Melnik", flat );
//	 }
//
//
////	 @Test
////	 public void testEmptySurnameInConstructor() {
////		  try {
////				assertNotNull ( defaultOwner.getSurname () );
////		  } catch (FlatOwnerSurnameException e) {
////				e.printStackTrace ();
////		  } catch (NullLinkException e) {
////				e.printStackTrace ();
////		  }
////	 }
//
//	 @Test
//	 public void testGetSurname() {
//		  try {
//				assertEquals ( "Melnik", testedOwner.getSurname () );
//		  } catch (FlatOwnerSurnameException e) {
//				e.printStackTrace ();
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//	 }
//
//	 @Test(expected = FlatOwnerSurnameException.class)
//	 public void testGetEmptySurname() throws NullLinkException, FlatOwnerSurnameException {
//		  defaultOwner.getSurname ();
//	 }
//
//	 @Test(expected = NullLinkException.class)
//	 public void testGetSurnameWithNullLink() throws NullLinkException, FlatOwnerSurnameException {
//		  defaultOwner.setSurname ( null );
//		  defaultOwner.getSurname ();
//	 }
//
//
//	 @Test
//	 public void getFlat() {
//		  try {
//				assertEquals ( flat, testedOwner.getFlat () );
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//	 }
//
//	 @Test(expected = NullLinkException.class)
//	 public void getFlatWithNullLink() throws NullLinkException {
//		  defaultOwner.getFlat ();
//	 }
//
//
//	 @Test
//	 public void testSetSurname() {
//		  try {
//				defaultOwner.setSurname ( "Melnik" );
//				assertEquals ( "Melnik", defaultOwner.getSurname () );
//		  } catch (FlatOwnerSurnameException e) {
//				e.printStackTrace ();
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//	 }
//
//	 @Test(expected = FlatOwnerSurnameException.class)
//	 public void testSetSurnameEmptty() throws NullLinkException, FlatOwnerSurnameException {
//		  defaultOwner.setSurname ( "" );
//	 }
//
//	 @Test(expected = NullPointerException.class)
//	 public void testSetSurnameNullLink() throws NullLinkException, FlatOwnerSurnameException {
//		  defaultOwner.setSurname ( null );
//	 }
//
//
//	 @Test
//	 public void testSetFlat() {
//		  try {
//				defaultOwner.setFlat ( flat );
//				assertEquals ( flat, defaultOwner.getFlat () );
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//	 }
//
//	 @Test (expected = NullLinkException.class)
//	 public void testSetFlatNullLink() throws NullLinkException {
//				defaultOwner.setFlat ( null );
//	 }
//
//
//	 @Test
//	 public void equals() {
//		  try {
//				defaultOwner.setSurname ( "Melnik" );
//				defaultOwner.setFlat ( flat );
//		  } catch (FlatOwnerSurnameException e) {
//				e.printStackTrace ();
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//		  assertEquals ( true, defaultOwner.equals ( testedOwner ) );
//	 }
//
//	 @Test
//	 public void testNotEqualsObject (){
//		  try {
//				defaultOwner.setSurname ( "Mel" );
//				defaultOwner.setFlat ( flat );
//		  } catch (FlatOwnerSurnameException e) {
//				e.printStackTrace ();
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//		  assertEquals ( false, defaultOwner.equals ( testedOwner ) );
//	 }
//
//	 @Test
//	 public void testequalsWithNull (){
//	 	 assertEquals ( false, testedOwner.equals ( null ) );
//	 }
//
//	 @Test
//	 public void testHashCode() {
//		  try {
//				defaultOwner.setSurname ( "Melnik" );
//				defaultOwner.setFlat ( flat );
//		  } catch (FlatOwnerSurnameException e) {
//				e.printStackTrace ();
//		  } catch (NullLinkException e) {
//				e.printStackTrace ();
//		  }
//		  assertEquals ( defaultOwner.hashCode (), testedOwner.hashCode () );
//	 }
//
//	 @Test
//	 public void testHashCodeDiffObjects() {
//		  assertNotEquals ( defaultOwner.hashCode (), testedOwner.hashCode () );
//	 }
//
//	 @Test (expected = MethodParameterException.class)
//	 public void testInvalidParameterAmountOfEquipmentsInBuyEquipment () throws NullLinkException, MethodParameterException {
//		  Building warehouse = new Warehouse (  );
//	 	 testedOwner.buyHouseEquipmentFromWarehouse ( -5, warehouse);
//	 }
//
//	 @Test (expected = NullLinkException.class)
//	 public void testBuyHouseEquipmentFromWarehouseWithNullLink () throws NullLinkException, MethodParameterException {
//		  Building warehouse = new Warehouse (  );
//		  testedOwner.buyHouseEquipmentFromWarehouse ( 10, null);
//	 }
//
//	 @Test
//	 public void buyHouseEquipmentFromWarehouse() {
//	 }
//
//	 @Test
//	 public void addAllHouseEquipmentInFlat() {
//	 }
}