package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop defaultShop;

    @Before
    public void setUp() throws Exception {
        defaultShop = new Shop();
    }

    @Test
    public void testFirsDefaultConstructor() {

        assertNotNull(defaultShop.getMicrowaveSection());
        assertNotNull(defaultShop.getMulticookerSection());
        assertNotNull(defaultShop.getToastSection());
    }

    @Test
    public void testGetMicrowaveSection() {
        assertNotNull(defaultShop.getMicrowaveSection());
    }

    @Test
    public void testGetMulticookerSection() {
        assertNotNull(defaultShop.getMulticookerSection());
    }

    @Test
    public void testGetToastSection() {
        assertNotNull(defaultShop.getToastSection());
    }

    @Test
    public void testSetMicrowaveSection() {

        ShopSection section = new ShopSection();
        try {
            defaultShop.setMicrowaveSection(section);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        assertEquals(section, defaultShop.getMicrowaveSection());
    }

    @Test(expected = InvalidParameterException.class)
    public void testSetMicrowaveSectionWithnull() throws InvalidParameterException {
        defaultShop.setMicrowaveSection(null);
    }

    @Test
    public void testSetMulticookerSection() {

        ShopSection section = new ShopSection();
        try {
            defaultShop.setMulticookerSection(section);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        assertEquals(section, defaultShop.getMicrowaveSection());
    }

    @Test(expected = InvalidParameterException.class)
    public void testSetMulticookerSectionWithnull() throws InvalidParameterException {
        defaultShop.setMulticookerSection(null);
    }

    @Test
    public void testSetToastSection() {

        ShopSection section = new ShopSection();
        try {
            defaultShop.setToastSection(section);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        assertEquals(section, defaultShop.getMicrowaveSection());
    }

    @Test(expected = InvalidParameterException.class)
    public void testSetToastSectionWithnull() throws InvalidParameterException {
        defaultShop.setToastSection(null);
    }

    @Test
    public void testEqualsOneObject() {
        assertEquals(true, defaultShop.equals(defaultShop));
    }

    @Test
    public void testEqualsObject() {
        Shop shop = new Shop();
        assertEquals(true, defaultShop.equals(shop));
    }

    @Test
    public void testEqualsWithNull() {
        assertEquals(false, defaultShop.equals(null));
    }

    @Test
    public void testEqualDiffObject() {
        assertEquals(false, defaultShop.equals(new HouseEquipment()));
    }

    @Test
    public void testHashCode() {
        Shop shop = new Shop();
        assertEquals(defaultShop.hashCode(), shop.hashCode());
    }

    @Test
    public void testHashCodeDiffObject() {
        HouseEquipment[] equipments = {
                new HouseEquipment()
        };
        Shop shop = new  Shop (equipments);
        assertNotEquals(defaultShop.hashCode(),shop.hashCode() );
    }
}