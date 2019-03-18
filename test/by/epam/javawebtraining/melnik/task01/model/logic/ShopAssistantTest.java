package by.epam.javawebtraining.melnik.task01.model.logic;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Microwave;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.Toast;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Shop;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.EndArrayException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopAssistantTest {

    private Shop testedBuilding;
    private HouseEquipment addedEquipment;
    private HouseEquipment[] equipments;

    @Before
    public void setUp() {

        equipments = new HouseEquipment[]{
                new Toast(1000, 700, true),
                null,
                new Toast(1200, 840, false),
                null
        };

        testedBuilding = new Shop(equipments);

        addedEquipment = new Microwave(1000, 700, 20);
    }

    @Test
    public void testAddEquipmetInShop() {
        HouseEquipment[] expected = {
                equipments[0],
                addedEquipment,
                equipments[2],
                addedEquipment
        };

        try {
            ShopAssistant.addEquipmetInShop(testedBuilding, addedEquipment, addedEquipment);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        assertArrayEquals(expected, testedBuilding.getEquipments());
    }

    @Test(expected = InvalidParameterException.class)
    public void testAddEquipmetInShopWithNullLink() throws InvalidParameterException, EndArrayException {

        ShopAssistant.addEquipmetInShop(null, addedEquipment, addedEquipment);
    }
}