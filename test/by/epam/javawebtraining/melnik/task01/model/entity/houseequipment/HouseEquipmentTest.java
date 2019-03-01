package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HouseEquipmentTest {

    private HouseEquipment firstEquipment;
    private HouseEquipment secondEquipment;

    @Before
    public void setUp() throws Exception {
        firstEquipment = new HouseEquipment ( 1000, 700,
                                              HouseEquipmentType.MICROWAWE );
        secondEquipment = new HouseEquipment ( 900, 600,
                                               HouseEquipmentType.MICROWAWE );

    }

    @Test
    public void testFirstInvalidTotalPowerInConstructor() {
        HouseEquipment defaultEquipment = new HouseEquipment ();
        HouseEquipment testEquipment = new HouseEquipment ( -100, 100,
                                                            HouseEquipmentType.MICROWAWE );

        assertEquals ( defaultEquipment, testEquipment );
    }

    @Test
    public void testSecondInvalidTotalPowerInConstructor() {
        HouseEquipment defaultEquipment = new HouseEquipment ();
        HouseEquipment testEquipment = new HouseEquipment ( 2600, 100,
                                                            HouseEquipmentType.MICROWAWE );

        assertEquals ( defaultEquipment, testEquipment );
    }

    @Test
    public void testFirstInvalidPowerConsumptionInConstructor() {
        HouseEquipment defaultEquipment = new HouseEquipment ();
        HouseEquipment testEquipment = new HouseEquipment ( 1000, -100,
                                                            HouseEquipmentType.MICROWAWE );

        assertEquals ( defaultEquipment, testEquipment );
    }

    @Test
    public void testSecondInvalidPowerConsumptionInConstructor() {
        HouseEquipment defaultEquipment = new HouseEquipment ();
        HouseEquipment testEquipment = new HouseEquipment ( 1000, 800,
                                                            HouseEquipmentType.MICROWAWE );

        assertEquals ( defaultEquipment, testEquipment );
    }

    @Test
    public void getTotalPower() {
        double expected = 1000;
        assertEquals ( expected, firstEquipment.getTotalPower (), 0.1 );

    }

    @Test
    public void getPowerConsumption() {
        double expected = 700;
        assertEquals ( expected, firstEquipment.getPowerConsumption (), 0.1 );

    }

    @Test
    public void getIsTurningOn() {
        boolean expected = false;

        assertEquals ( expected, firstEquipment.getIsTurningOn () );
    }

    @Test
    public void setTotalPower() {
        double expected = 900;
        try {
            firstEquipment.setTotalPower ( 900 );
        } catch (InvalidParameterException e) {
            e.printStackTrace ();
        }

        assertEquals ( expected, firstEquipment.getTotalPower (), 0.1 );
    }

    @Test(expected = InvalidParameterException.class)
    public void firstInvalidParameterSetTotalPower() throws InvalidParameterException {
        firstEquipment.setTotalPower ( -100 );
    }

    @Test(expected = InvalidParameterException.class)
    public void secondInvalidParameterSetTotalPower() throws InvalidParameterException {
        firstEquipment.setTotalPower ( 2600 );
    }

    @Test
    public void setPowerConsumption() throws InvalidParameterException {
        double expected = 600;

        firstEquipment.setPowerConsumption ( 600 );

        assertEquals ( expected, firstEquipment.getPowerConsumption (), 0.1 );
    }

    @Test(expected = InvalidParameterException.class)
    public void firstInvalidSetPowewrConsumption() throws InvalidParameterException {

        firstEquipment.setPowerConsumption ( -100 );
    }

    @Test(expected = InvalidParameterException.class)
    public void secondInvalidSetPowewrConsumption() throws InvalidParameterException {

        firstEquipment.setPowerConsumption ( 800 );
    }

    @Test
    public void setIsTurningOn() {
        firstEquipment.setIsTurningOn ( true );
        assertEquals ( true, firstEquipment.getIsTurningOn () );
    }

    @Test
    public void firstTestEquals() throws InvalidParameterException {

        firstEquipment.setTotalPower ( 900 );
        firstEquipment.setPowerConsumption ( 600 );

        assertEquals ( true, firstEquipment.equals ( secondEquipment ) );
    }

    @Test
    public void secondTestEquals() {
        assertNotEquals ( true, firstEquipment.equals ( secondEquipment ) );
    }

    @Test
    public void testEqualsWithNullLink() {
        assertNotEquals ( true, firstEquipment.equals ( null ) );
    }

    @Test
    public void testObjectsWithDiffHashCode() {
        assertNotEquals ( firstEquipment.hashCode (), secondEquipment.hashCode () );
    }

    @Test
    public void testObjectsWithEqualHashCode() throws InvalidParameterException {
        firstEquipment.setTotalPower ( 900 );
        firstEquipment.setPowerConsumption ( 600 );

        assertEquals ( firstEquipment.hashCode (), secondEquipment.hashCode () );
    }

    @Test
    public void turnOn() {
        firstEquipment.turnOn ();

        assertEquals ( true, firstEquipment.getIsTurningOn () );
    }

    @Test
    public void turnOff() {
        firstEquipment.turnOff ();

        assertEquals ( false, firstEquipment.getIsTurningOn () );
    }
}