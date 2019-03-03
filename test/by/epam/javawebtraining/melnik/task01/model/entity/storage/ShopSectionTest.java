package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ShopSectionTest {

    private ShopSection defaultSection;
    private HouseEquipment[] equipments;

    @Before
    public void setUp() throws Exception {
        defaultSection = new ShopSection();

        equipments = new HouseEquipment[]{
                CreatorHouseEquipment.createHouseEquipment(HouseEquipmentType.MICROWAWE),
                CreatorHouseEquipment.createHouseEquipment(HouseEquipmentType.MULTICOOKER),
                CreatorHouseEquipment.createHouseEquipment(HouseEquipmentType.TOAST)
        };
    }

    @Test
    public void TestDefaultConstructor() {
        assertNotEquals(null, defaultSection.getEquipments());
    }

    @Test(expected = NullLinkException.class)
    public void TestConstructorWithNullLink() throws NullLinkException {
        ShopSection test = new ShopSection(null);
    }

    @Test
    public void TestParametricConstructor() {
        ShopSection test = null;
        try {
            test = new ShopSection(equipments);
        } catch (NullLinkException e) {
            e.printStackTrace();
        }
        assertArrayEquals(equipments, test.getEquipments());
    }

    @Test
    public void testSetEquipments() {
        try {
            defaultSection.setEquipments(equipments);
        } catch (NullLinkException e) {
            e.printStackTrace();
        }

        assertArrayEquals(equipments, defaultSection.getEquipments());
    }

    @Test (expected = NullLinkException.class)
    public void testNullLinkSetEquipments () throws NullLinkException {
        defaultSection.setEquipments(null);
    }
}