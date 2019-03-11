package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class SearchParameterTotalEnergyTest {

    private Building building;

    public SearchParameterTotalEnergyTest(Building building) {
        this.building = building;
    }

    @Parameters
    public static Building[] data() {

        HouseEquipment microwave1 = new HouseEquipment(1000, 700,
                HouseEquipmentType.MICROWAWE);
        HouseEquipment multicooker1 = new HouseEquipment(2000, 1300,
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


        Building[] data = {building1, building2};
        return data;
    }

    @Test
    public void testTakeEquipmentWithMinPower() {
        SearchParameterPower search = new SearchParameterTotalEnergy();
        try {
            assertEquals(building.getEquipments()[1],
                    search.takeEquipmentWithMaxPower(building));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTakeEquipmentWithMaxPower() throws NullLinkException, EmptyListException {
        SearchParameterPower search = new SearchParameterTotalEnergy();
        try {
            assertEquals(building.getEquipments()[2],
                    search.takeEquipmentWithMinPower(building));
        } catch (InvalidParameterException e) {
            e.printStackTrace();
        }
    }
}