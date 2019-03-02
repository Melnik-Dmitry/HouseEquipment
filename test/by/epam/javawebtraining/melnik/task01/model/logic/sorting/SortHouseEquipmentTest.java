package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SortHouseEquipmentTest {
    private ComercialBuilding building;
    private EquipmentComparator comparator;

    @Before
    public void setUp() throws Exception {
        building = new ComercialBuilding ();

        HouseEquipment microwave = new HouseEquipment ( 1000, 700,
                                                        HouseEquipmentType.MICROWAWE );
        HouseEquipment multicooker = new HouseEquipment ( 2000, 1300,
                                                          HouseEquipmentType.MULTICOOKER );
        HouseEquipment toast = new HouseEquipment ( 600, 420,
                                                    HouseEquipmentType.TOAST );


        List<HouseEquipment> firstListEquipments = Arrays.asList ( microwave, multicooker, toast );

        building.setHouseEquipments ( firstListEquipments );
        comparator = new EquipmentComparator ();

    }

    @Test
    public void testSortSomething() throws NullLinkException {
        HouseEquipment[] sorted = {
                building.getHouseEquipments ().get ( 2 ),
                building.getHouseEquipments ().get ( 0 ),
                building.getHouseEquipments ().get ( 1 )
        };

        new SortHouseEquipment ().sortSomething ( building, comparator );
        HouseEquipment[] fromBuilding = (HouseEquipment[]) building.getHouseEquipments ().toArray ();

        assertArrayEquals ( sorted, fromBuilding );
    }
}