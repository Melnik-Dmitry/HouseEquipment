package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;

import java.util.Collections;
import java.util.List;

public class SearchParameterTotalEnergy implements SearchParameterPower<HouseEquipment> {

    @Override
    public HouseEquipment takeEquipmentWithMinPower(ComercialBuilding comercialBuilding) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment ().IsNull ( comercialBuilding );
        List<HouseEquipment> equipments = comercialBuilding.getHouseEquipments ();
        new CheckParametrOfHouseEquipment ().isEmpty ( equipments );

        return Collections.min ( equipments, new EquipmentComparator () );
    }

    @Override
    public HouseEquipment takeEquipmentWithMaxPower(ComercialBuilding comercialBuilding) throws NullLinkException, EmptyListException {
        new CheckParametrOfHouseEquipment ().IsNull ( comercialBuilding );
        List<HouseEquipment> equipments = comercialBuilding.getHouseEquipments ();
        new CheckParametrOfHouseEquipment ().isEmpty ( equipments );

        return Collections.max ( equipments, new EquipmentComparator () );
    }
}
