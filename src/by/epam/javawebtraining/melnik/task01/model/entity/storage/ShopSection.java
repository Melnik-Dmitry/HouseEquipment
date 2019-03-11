package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Arrays;

public class ShopSection {
    public static final int DEFAULT_CAPACITY = 0;

    private HouseEquipment[] equipmentsInSection;

    public ShopSection() {
        equipmentsInSection = new HouseEquipment[DEFAULT_CAPACITY];
    }

    public ShopSection(HouseEquipment[] equipmentsInSection) {

        if (equipmentsInSection == null) {
            new ConsolePrint().print("Link cann't be null. Parameter was seted by default capacity");
            this.equipmentsInSection = new HouseEquipment[DEFAULT_CAPACITY];
            return;
        }
        this.equipmentsInSection = equipmentsInSection;
    }

    public HouseEquipment[] getEquipmentsInSection() {
        return equipmentsInSection;
    }

    public void setEquipmentsInSection(HouseEquipment[] equipmentsInSection) throws InvalidParameterException {

        new CheckBuildingParameters().IsNull(equipmentsInSection);
        this.equipmentsInSection = equipmentsInSection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopSection)) return false;
        ShopSection section = (ShopSection) o;
        return Arrays.equals(equipmentsInSection, section.equipmentsInSection);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(equipmentsInSection);
    }
}
