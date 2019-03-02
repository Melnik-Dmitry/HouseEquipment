package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchParameterPowerConsumptionTest {

    private ComercialBuilding building;

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
    }

    @Test
    public void testTakeEquipmentWithMinPower() throws NullLinkException, EmptyListException {
        SearchParameterPower search = new SearchParameterPowerConsumption ();
        assertEquals ( building.getHouseEquipments ().get ( 1 ),
                       search.takeEquipmentWithMaxPower ( building ) );
    }

    @Test
    public void testTakeEquipmentWithMaxPower() throws NullLinkException, EmptyListException {
        SearchParameterPower search = new SearchParameterPowerConsumption ();
        assertEquals ( building.getHouseEquipments ().get ( 2 ),
                       search.takeEquipmentWithMinPower ( building ) );
    }
}