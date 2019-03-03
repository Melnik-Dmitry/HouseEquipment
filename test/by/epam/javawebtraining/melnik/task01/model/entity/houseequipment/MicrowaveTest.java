package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.InnerVolumeMicrowaveException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MicrowaveTest {

    Microwave defaultMicro;

    @Before
    public void setUp() throws Exception {
        defaultMicro = new Microwave(1000, 700, 0);
    }

    @Test
    public void testFistInvalidParameterInConstructor() {
        Microwave test = new Microwave(1000, 700, 15);

        assertEquals(defaultMicro, test);
    }

    @Test
    public void testSecondInvalidParameterInConstructor() {
        Microwave test = new Microwave(1000, 700, 25);

        assertEquals(defaultMicro, test);
    }

    @Test
    public void testGetInnerVolume() {
        try {
            defaultMicro.setInnerVolume(17);
        } catch (InnerVolumeMicrowaveException e) {
            e.printStackTrace();
        }
        assertEquals(17, defaultMicro.getInnerVolume());
    }

    @Test
    public void TestFirsSetInnerVolume() {
        try {
            defaultMicro.setInnerVolume(20);
        } catch (InnerVolumeMicrowaveException e) {
            e.printStackTrace();
        }

        assertEquals(20, defaultMicro.getInnerVolume());
    }

    @Test (expected = InnerVolumeMicrowaveException.class)
    public void testFirstInvalidSetInnerVolume () throws InnerVolumeMicrowaveException {
        defaultMicro.setInnerVolume(15);
    }

    @Test (expected = InnerVolumeMicrowaveException.class)
    public void testSecondInvalidSetInnerVolume () throws InnerVolumeMicrowaveException {
        defaultMicro.setInnerVolume(25);
    }

    @Test
    public void testEqualsObject() {
        try {
            defaultMicro.setInnerVolume(17);
        } catch (InnerVolumeMicrowaveException e) {
            e.printStackTrace();
        }

        Microwave testMicro = new Microwave(1000, 700, 17);

        assertEquals(true, defaultMicro.equals(testMicro));
    }

    @Test
    public void testNotEqualsObject() {
        Microwave testMicro = new Microwave(1000, 700, 20);

        assertEquals(false, defaultMicro.equals(testMicro));
    }

    @Test
    public void testEqualsWithNull() {
        assertEquals(false, defaultMicro.equals(null));

    }

    @Test
    public void testEqualsDifferentObject() {
        assertEquals(false, defaultMicro.equals(new Object()));
    }

    @Test
    public void testHashCodeEqualsObject() {
        try {
            defaultMicro.setInnerVolume(17);
        } catch (InnerVolumeMicrowaveException e) {
            e.printStackTrace();
        }
        Microwave testMicro = new Microwave(1000, 700, 17);

        assertEquals(defaultMicro.hashCode(), testMicro.hashCode());
    }

    @Test
    public void testHashCodeNotEqualsObject() {
        try {
            defaultMicro.setInnerVolume(17);
        } catch (InnerVolumeMicrowaveException e) {
            e.printStackTrace();
        }
        Microwave testMicro = new Microwave(1000, 700, 20);

        assertNotEquals(defaultMicro.hashCode(), testMicro.hashCode());
    }
}