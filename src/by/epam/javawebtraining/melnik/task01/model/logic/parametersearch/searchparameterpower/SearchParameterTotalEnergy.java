package by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckBuildingParameters;

public class SearchParameterTotalEnergy implements SearchParameterPower<HouseEquipment> {

    private HouseEquipment minHouseEquipment(HouseEquipment[] equipments)
            throws InvalidParameterException, EmptyListException {

        new CheckBuildingParameters().IsNull(equipments);
        new CheckBuildingParameters().isEmpty(equipments);

        HouseEquipment min = equipments[0];

        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i].getTotalPower() < min.getTotalPower()) {
                min = equipments[i];
            }
        }
        return min;
    }

    @Override
    public HouseEquipment takeEquipmentWithMinPower(Building building)
            throws EmptyListException, InvalidParameterException {

        return minHouseEquipment(building.getEquipments());
    }

    private HouseEquipment maxHouseEquipment(HouseEquipment[] equipments)
            throws EmptyListException, InvalidParameterException {

        new CheckBuildingParameters().IsNull(equipments);
        new CheckBuildingParameters().isEmpty(equipments);

        HouseEquipment max = equipments[0];

        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i].getTotalPower() > max.getTotalPower()) {
                max = equipments[i];
            }
        }
        return max;
    }

    @Override
    public HouseEquipment takeEquipmentWithMaxPower(Building building)
            throws EmptyListException, InvalidParameterException {

        return maxHouseEquipment(building.getEquipments());
    }
}
