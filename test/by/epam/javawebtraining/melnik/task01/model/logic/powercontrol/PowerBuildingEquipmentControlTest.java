package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class PowerBuildingEquipmentControlTest {

    private Double expected;
    private Building building;

    public PowerBuildingEquipmentControlTest(Double expected, Building building) {
        this.expected = expected;
        this.building = building;
    }

    @Parameters
    public static Object[][] testData() {
        HouseEquipment microwave1 = new HouseEquipment(1000, 700,
                HouseEquipmentType.MICROWAWE);
        HouseEquipment multicooker1 = new HouseEquipment(2000, 1400,
                HouseEquipmentType.MULTICOOKER);
        HouseEquipment toast1 = new HouseEquipment(600, 420,
                HouseEquipmentType.TOAST);
        HouseEquipment[] firstArray = {microwave1, multicooker1, toast1};
        Building building1 = new Building(firstArray);


        HouseEquipment microwave2 = new HouseEquipment(1500, 1050,
                HouseEquipmentType.MICROWAWE);
        HouseEquipment multicooker2 = new HouseEquipment(1900, 1330,
                HouseEquipmentType.MULTICOOKER);
        HouseEquipment toast2 = new HouseEquipment(750, 525,
                HouseEquipmentType.TOAST);
        HouseEquipment[] secondArray = {microwave2, multicooker2, toast2};
        Building building2 = new Building(secondArray);

        Object[][] data = {
                {new Double(3600.0), building1},
                {new Double(4150.0), building2},
        };
        return data;
    }

    @Test
    public void testDeemPowerConsumptionAllTurningOff() {
        PowerControl control = new PowerBuildingEquipmentControl();

        for (int i = 0; i < building.getEquipments().length; i++) {
            building.getEquipments()[i].turnOff();
        }

        try {
            assertEquals(0, control.deemPowerConsumption(building), 0.1);
        } catch (EmptyListException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeemPowerConsumptionAllTurningOn() {

        for (int i = 0; i < building.getEquipments().length; i++) {
            building.getEquipments()[i].turnOn();
        }

        PowerControl control = new PowerBuildingEquipmentControl();
        try {
            assertEquals(expected * 0.7, control.deemPowerConsumption(building), 0.1);
        } catch (EmptyListException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeemPowerConsumptionNotAllTurningOn() {

        for (int i = 0; i < building.getEquipments().length; i++) {
            building.getEquipments()[i].turnOn();
            if (i % 2 != 0) {
                building.getEquipments()[i].turnOff();
            }
        }

        PowerControl control = new PowerBuildingEquipmentControl();
        try {
            assertEquals((expected * 0.7 - building.getEquipments()[1].getPowerConsumption()),
                    control.deemPowerConsumption(building), 0.1);
        } catch (EmptyListException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestDeemTotalPower() {
        PowerControl control = new PowerBuildingEquipmentControl();
        try {
            assertEquals(expected, control.deemTotalPower(building), 0.1);
        } catch (EmptyListException e) {
            e.printStackTrace();
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }
}