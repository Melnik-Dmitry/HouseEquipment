package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BuildingTest {

//
//    private List<HouseEquipment> secondListEquipments;
//    private List<HouseEquipment> thirdListEquipment;
//
//    private Building defaultBuilding;
//    private Building parametricBuilding;
//
//    List <HouseEquipment> testEquipment;
//
//
//    @Before
//    public void setUp() throws Exception {
//        defaultBuilding = new Building ();
//
//        HouseEquipment microwave = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );
//        HouseEquipment multicooker = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER );
//        HouseEquipment toast = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST );
//        List<HouseEquipment> firstListEquipments = Arrays.asList ( microwave, multicooker, toast );
//        parametricBuilding = new Building ( firstListEquipments );
//        secondListEquipments = new ArrayList<> ( firstListEquipments );
//
//        thirdListEquipment = new ArrayList<> ();
//        thirdListEquipment.add ( CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE ) );
//        thirdListEquipment.add ( CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER ) );
//        thirdListEquipment.add ( CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST ) );
//    }
//
//    @Test
//    public void testDefaultConstructor () throws NullLinkException {
//        assertNotEquals ( null, defaultBuilding.getEquipments () );
//    }
//
//    @Test (expected = NullLinkException.class)
//    public void testConstructorWithNull () throws NullLinkException {//throws NullPointerException
//        new Building ( testEquipment  ).getEquipments ();
//    }
//
//    @Test
//    public void testGetHouseEquipments() throws NullLinkException {
//        assertEquals ( secondListEquipments, parametricBuilding.getEquipments () );
//    }
//
//    @Test
//    public void testSetHouseEquipments() throws NullLinkException {
//        defaultBuilding.setEquipments ( thirdListEquipment );
//
//        assertEquals ( thirdListEquipment.get ( 0 ), defaultBuilding.getEquipments ().get ( 0 ) );
//        assertEquals ( thirdListEquipment.get ( 1 ), defaultBuilding.getEquipments ().get ( 1 ) );
//        assertEquals ( thirdListEquipment.get ( 2 ), defaultBuilding.getEquipments ().get ( 2 ) );
//    }
//
//    @Test
//    public void testEqualsObject() {
//        assertEquals ( true, parametricBuilding.equals ( new Building ( secondListEquipments ) ) );
//    }
//
//    @Test
//    public void testNotEqualsObject() {
//        assertEquals ( false, parametricBuilding.equals ( new Building ( thirdListEquipment ) ) );
//    }
//
//    @Test
//    public void testEqualsWithObject() {
//        assertEquals ( false, parametricBuilding.equals ( null) );
//    }
//
//    @Test
//    public void testEqualsOneObject() {
//        assertEquals ( true, parametricBuilding.equals ( parametricBuilding) );
//    }
//
//    @Test
//    public void testHashCodeEqualsObject () {
//        assertEquals ( parametricBuilding.hashCode (), new Building ( secondListEquipments ).hashCode () );
//    }
//
//    @Test
//    public void testHashCodeNotEqualsObject () {
//        assertNotEquals ( parametricBuilding.hashCode (), new Building ( thirdListEquipment).hashCode () );
//    }
}