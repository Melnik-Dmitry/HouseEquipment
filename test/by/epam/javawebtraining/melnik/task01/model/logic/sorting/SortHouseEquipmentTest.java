package by.epam.javawebtraining.melnik.task01.model.logic.sorting;

import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertArrayEquals;

@RunWith(value = Parameterized.class)
public class SortHouseEquipmentTest {
    private Building building;

    public SortHouseEquipmentTest(Building building) {
        this.building = building;
    }

//    @Parameters
//    public static Building[] data() {
//
//        HouseEquipment microwave1 = new HouseEquipment ( 1000, 700,
//                                                         HouseEquipmentType.MICROWAWE );
//        HouseEquipment multicooker1 = new HouseEquipment ( 2000, 1300,
//                                                           HouseEquipmentType.MULTICOOKER );
//        HouseEquipment toast1 = new HouseEquipment ( 600, 420,
//                                                     HouseEquipmentType.TOAST );
//        List<HouseEquipment> firstListEquipments1 = Arrays.asList ( microwave1, multicooker1, toast1 );
//        Building building1 = new Building ( firstListEquipments1);
//
//
//        HouseEquipment microwave2 = new HouseEquipment ( 1500, 1050,
//                                                         HouseEquipmentType.MICROWAWE );
//        HouseEquipment multicooker2 = new HouseEquipment ( 1900, 1330,
//                                                           HouseEquipmentType.MULTICOOKER );
//        HouseEquipment toast2 = new HouseEquipment ( 750, 525,
//                                                     HouseEquipmentType.TOAST );
//        List<HouseEquipment> firstListEquipments2 = Arrays.asList ( microwave2, multicooker2, toast2);
//        Building building2 = new Building ( firstListEquipments2);
//
//
//        Building[] data = {building1, building2};
//        return data;
//    }
//
//
////    @Before
////    public void setUp() throws Exception {
////        building = new Building ();
////
////        HouseEquipment microwave = new HouseEquipment ( 1000, 700,
////                                                        HouseEquipmentType.MICROWAWE );
////        HouseEquipment multicooker = new HouseEquipment ( 2000, 1300,
////                                                          HouseEquipmentType.MULTICOOKER );
////        HouseEquipment toast = new HouseEquipment ( 600, 420,
////                                                    HouseEquipmentType.TOAST );
////
////
////        List<HouseEquipment> firstListEquipments = Arrays.asList ( microwave, multicooker, toast );
////
////        building.setEquipmentsInSection ( firstListEquipments );
////        comparator = new EquipmentComparator ();
////
////    }
//
//    @Test
//    public void testSortSomething() throws NullLinkException {
//        HouseEquipment[] sorted = {
//                building.getEquipments ().get ( 2 ),
//                building.getEquipments ().get ( 0 ),
//                building.getEquipments ().get ( 1 )
//        };
//
//        new SortHouseEquipment ().sort ( building, new EquipmentComparator () );
//        HouseEquipment[] fromBuilding = (HouseEquipment[]) building.getEquipments ().toArray ();
//
//        assertArrayEquals ( sorted, fromBuilding );
//    }
}