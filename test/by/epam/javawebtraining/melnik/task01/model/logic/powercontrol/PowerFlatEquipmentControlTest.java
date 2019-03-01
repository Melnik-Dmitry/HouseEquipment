package by.epam.javawebtraining.melnik.task01.model.logic.powercontrol;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PowerFlatEquipmentControlTest {

    private ComercialBuilding building;

    @Before
    public void setUp() throws Exception {
        building = new ComercialBuilding ();

        HouseEquipment microwave = new HouseEquipment ( 1000, 700,
                                                        HouseEquipmentType.MICROWAWE );
        microwave.turnOn ();
        HouseEquipment multicooker = new HouseEquipment ( 2000, 1300,
                                                          HouseEquipmentType.MULTICOOKER );
        multicooker.turnOn ();
        HouseEquipment toast = new HouseEquipment ( 600, 420,
                                                    HouseEquipmentType.TOAST );
        toast.turnOn ();

        List<HouseEquipment> firstListEquipments = Arrays.asList ( microwave, multicooker, toast );

        building.setHouseEquipments ( firstListEquipments );
    }

    @Test
    public void deemPowerConsumption() throws NullLinkException, EmptyListException {
        PowerControl control = new PowerFlatEquipmentControl ();
        assertEquals ( 2420, control.deemPowerConsumption ( building ), 0.1 );
    }

    @Test
    public void deemTotalPower() throws NullLinkException, EmptyListException {
        PowerControl control = new PowerFlatEquipmentControl ();
        assertEquals ( 3600, control.deemTotalPower ( building ), 0.1 );
    }
}