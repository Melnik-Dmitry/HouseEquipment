package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building {

    private List<HouseEquipment> houseEquipments;

    public Building() {
        houseEquipments = new ArrayList<> ();
    }

    public Building(List<HouseEquipment> houseEquipments) {
        if (houseEquipments == null) {
            new ConsolePrint ().print ( "Link cann't be null" );
        }
        this.houseEquipments = houseEquipments;
    }

    public List<HouseEquipment> getHouseEquipments() {
        return houseEquipments;
    }

    public void setHouseEquipments(List<HouseEquipment> houseEquipments) throws NullLinkException {
        new CheckParametrOfHouseEquipment ().IsNull ( houseEquipments );
        this.houseEquipments = houseEquipments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return houseEquipments.equals ( building.houseEquipments );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( houseEquipments );
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder ( "amount equinments = " + houseEquipments.size () + '\n' );

        for (HouseEquipment auto : houseEquipments) {
            builder.append ( auto.toString () + '\n' );
        }
//        builder.append ( '}' );

        return builder.toString ();
    }
}
