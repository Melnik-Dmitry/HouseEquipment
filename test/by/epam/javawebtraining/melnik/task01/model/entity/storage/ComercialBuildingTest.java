package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ComercialBuildingTest {

    //    private List<HouseEquipment> firstListEquipments;
    private List<HouseEquipment> secondListEquipments;
    private List<HouseEquipment> thirdListEquipment;

    private ComercialBuilding defaultBuilding;
    private ComercialBuilding parametricBuilding;

    List <HouseEquipment> testEquipment;


    @Before
    public void setUp() throws Exception {
        defaultBuilding = new ComercialBuilding ();

        HouseEquipment microwave = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );
        HouseEquipment multicooker = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER );
        HouseEquipment toast = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST );
        List<HouseEquipment> firstListEquipments = Arrays.asList ( microwave, multicooker, toast );
        parametricBuilding = new ComercialBuilding ( firstListEquipments );
        secondListEquipments = new ArrayList<> ( firstListEquipments );

        thirdListEquipment = new ArrayList<> ();
        thirdListEquipment.add ( CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE ) );
        thirdListEquipment.add ( CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER ) );
        thirdListEquipment.add ( CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST ) );
    }

    @Test
    public void testDefaultConstructor (){
        assertNotEquals ( null, defaultBuilding.getHouseEquipments () );
    }

//    @Test (expected = NullPointerException.class)
//    public void testConstructorWithnull () throws NullPointerException{
//        new ComercialBuilding ( testEquipment  );
//    }

    @Test
    public void testGetHouseEquipments() {
        assertEquals ( secondListEquipments, parametricBuilding.getHouseEquipments () );
    }

    @Test
    public void testSetHouseEquipments() throws NullLinkException {
        defaultBuilding.setHouseEquipments ( thirdListEquipment );

        assertEquals ( thirdListEquipment.get ( 0 ), defaultBuilding.getHouseEquipments ().get ( 0 ) );
        assertEquals ( thirdListEquipment.get ( 1 ), defaultBuilding.getHouseEquipments ().get ( 1 ) );
        assertEquals ( thirdListEquipment.get ( 2 ), defaultBuilding.getHouseEquipments ().get ( 2 ) );
    }

    @Test
    public void testEqualsObject() {
        assertEquals ( true, parametricBuilding.equals ( new ComercialBuilding ( secondListEquipments ) ) );
    }

    @Test
    public void testNotEqualsObject() {
        assertEquals ( false, parametricBuilding.equals ( new ComercialBuilding ( thirdListEquipment ) ) );
    }

    @Test
    public void testEqualsWithObject() {
        assertEquals ( false, parametricBuilding.equals ( null) );
    }

    @Test
    public void testEqualsOneObject() {
        assertEquals ( true, parametricBuilding.equals ( parametricBuilding) );
    }

    @Test
    public void testHashCodeEqualsObject () {
        assertEquals ( parametricBuilding.hashCode (), new ComercialBuilding ( secondListEquipments ).hashCode () );
    }

    @Test
    public void testHashCodeNotEqualsObject () {
        assertNotEquals ( parametricBuilding.hashCode (), new ComercialBuilding ( thirdListEquipment).hashCode () );
    }
}