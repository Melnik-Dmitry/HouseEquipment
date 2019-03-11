package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;


import static org.junit.Assert.assertArrayEquals;

@RunWith(value = Parameterized.class)
public class SortHouseEquipmentTest {

    private Building expected;
    private Building building;

    public SortHouseEquipmentTest(Building expected, Building building) {
        this.expected = expected;
        this.building = building;
    }

    @Parameters
    public static Building[][] data() {

        HouseEquipment microwave1 = new HouseEquipment(1000, 700,
                HouseEquipmentType.MICROWAWE);
        HouseEquipment multicooker1 = new HouseEquipment(2000, 1300,
                HouseEquipmentType.MULTICOOKER);
        HouseEquipment toast1 = new HouseEquipment(600, 420,
                HouseEquipmentType.TOAST);

        HouseEquipment[] firstArray = {toast1, multicooker1, microwave1};
        Building firstBuilding = new Building(firstArray);

        HouseEquipment[] secondArray = {multicooker1, toast1, microwave1};
        Building secondBuilding = new Building(secondArray);

        HouseEquipment[] thirdArray = {toast1, microwave1, multicooker1};
        Building expectedIncreasingBuilding = new Building(thirdArray);

        HouseEquipment[] fourthArray = { multicooker1, microwave1,toast1};
        Building expectedDescendingBuilding = new Building(fourthArray);

//        HouseEquipment microwave2 = new HouseEquipment(1500, 1050,
//                HouseEquipmentType.MICROWAWE);
//        HouseEquipment multicooker2 = new HouseEquipment(1900, 1330,
//                HouseEquipmentType.MULTICOOKER);
//        HouseEquipment toast2 = new HouseEquipment(750, 525,
//                HouseEquipmentType.TOAST);
//        MyList<HouseEquipment> firstListEquipments2 = Arrays.asList(microwave2, multicooker2, toast2);
//        Building building2 = new Building(firstListEquipments2);

        Building[][] data = {
                {expectedIncreasingBuilding, firstBuilding},
                {expectedIncreasingBuilding, secondBuilding},
                {expectedDescendingBuilding, firstBuilding},
                {expectedDescendingBuilding, secondBuilding}
        };
        return data;
    }
//
//    @Parameter ()
//    public Building [] fdd ();

//    public Building [] firstSort ();


    @Test
    public void testIncreasingSort() {
        Sort sorting = new SortHouseEquipment();

        try {
            sorting.increasingSort(building);
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }

        assertArrayEquals(expected.getEquipments(), building.getEquipments());
    }
}