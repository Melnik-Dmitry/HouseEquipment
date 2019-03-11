package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Microwave;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Flat;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.MethodParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.FlatOwnerSurnameException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlatOwnerTest {

    private FlatOwner defaultOwner;
    private FlatOwner testedOwner;
    private Flat flat;

    @Before
    public void setUp() throws Exception {
        flat = new Flat(10);
        defaultOwner = new FlatOwner();
        testedOwner = new FlatOwner("Melnik", flat);
    }

    @Test
    public void testFirstDefaultConstructor() {
        assertEquals("", defaultOwner.getSurname());
        assertNotNull(defaultOwner.getFlat());
    }

    @Test
    public void testNullSurnameInConstructor() {

        FlatOwner owner = new FlatOwner(null, flat);
        assertNotNull(owner.getSurname());
    }

    @Test
    public void testNullFlatInConstructor() {

        FlatOwner owner = new FlatOwner("Melnik", null);
        assertNotNull(owner.getFlat());
    }

    @Test
    public void testGetSurname() {
        assertEquals("Melnik", testedOwner.getSurname());

    }

    @Test
    public void testGetFlat() {
        assertEquals(flat, testedOwner.getFlat());
    }

    @Test
    public void testSetSurname() {
        try {
            defaultOwner.setSurname("Melnik");
        } catch (FlatOwnerSurnameException e) {
            assertEquals("Melnik", defaultOwner.getSurname());
        }
    }

    @Test(expected = FlatOwnerSurnameException.class)
    public void testSetSurnameEmpty() throws FlatOwnerSurnameException {
        defaultOwner.setSurname("");
    }

    @Test(expected = NullPointerException.class)
    public void testSetSurnameNullLink() throws FlatOwnerSurnameException {
        defaultOwner.setSurname(null);
    }

    @Test
    public void testSetFlat() {
        try {
            defaultOwner.setFlat(flat);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
        assertEquals(flat, defaultOwner.getFlat());
    }

    @Test(expected = InvalidParameterException.class)
    public void testSetFlatNullLink() throws InvalidParameterException {
        defaultOwner.setFlat(null);
    }

    @Test
    public void testEqualsObject() {
        try {
            defaultOwner.setSurname("Melnik");
            defaultOwner.setFlat(flat);
        } catch (FlatOwnerSurnameException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
        assertEquals(true, defaultOwner.equals(testedOwner));
    }

    @Test
    public void testNotEqualsObject() {
        try {
            defaultOwner.setSurname("Mel");
            defaultOwner.setFlat(flat);
        } catch (FlatOwnerSurnameException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
        assertEquals(false, defaultOwner.equals(testedOwner));
    }

    @Test
    public void testEqualsObjectWithNull() {
        assertEquals(false, testedOwner.equals(null));
    }

    @Test
    public void testHashCode() {
        try {
            defaultOwner.setSurname("Melnik");
            defaultOwner.setFlat(flat);
        } catch (FlatOwnerSurnameException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
        assertEquals(defaultOwner.hashCode(), testedOwner.hashCode());
    }

    @Test
    public void testHashCodeDiffObjects() {
        assertNotEquals(defaultOwner.hashCode(), testedOwner.hashCode());
    }

    @Test(expected = MethodParameterException.class)
    public void testInvalidParameterAmountOfEquipmentsInBuyEquipment()
            throws MethodParameterException, InvalidParameterException {

        testedOwner.buyHouseEquipment(-5, flat);
    }

    @Test(expected = InvalidParameterException.class)
    public void testBuyHouseEquipmentFromWarehouseWithNullLink()
            throws MethodParameterException, InvalidParameterException {

        testedOwner.buyHouseEquipment(10, null);
    }

    @Test
    public void testBuyHouseEquipment() {
        HouseEquipment[] equipments = {
                new HouseEquipment(),
                new HouseEquipment(),
                new HouseEquipment()
        };
        Shop shop = new Shop(equipments);

        try {
            assertNotNull(defaultOwner.buyHouseEquipment(2, shop));
        } catch (MethodParameterException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = InvalidParameterException.class)
    public void testAddAllHouseEquipmentInFlatWithNullLink() throws EmptyListException, InvalidParameterException {

        defaultOwner.addAllHouseEquipmentInFlat(null);
    }

    @Test(expected = EmptyListException.class)
    public void testAddAllHouseEquipmentInFlatWithEmpty() throws EmptyListException, InvalidParameterException {

        HouseEquipment[] equipments = new HouseEquipment[0];

        defaultOwner.addAllHouseEquipmentInFlat(equipments);
    }

    @Test
    public void testAddAllHouseEquipmentInFlat() {
        HouseEquipment microwave = new Microwave(1000, 700, 17);

        HouseEquipment[] equipments = {microwave, microwave};

        try {
            defaultOwner.addAllHouseEquipmentInFlat(equipments);
        } catch (EmptyListException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        assertEquals(microwave, defaultOwner.getFlat().getEquipments()[10]);
    }
}