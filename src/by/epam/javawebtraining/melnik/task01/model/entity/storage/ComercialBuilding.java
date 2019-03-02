package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.exception.technikexeption.NullLinkException;
import by.epam.javawebtraining.melnik.task01.validation.CheckParametrOfHouseEquipment;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComercialBuilding {

    private List<HouseEquipment> houseEquipments;

    public ComercialBuilding() {
        houseEquipments = new ArrayList<> ();
    }

    public ComercialBuilding(List<HouseEquipment> houseEquipments) {
        if (houseEquipments == null) {
            new ConsolePrint ().print ( "Link cann't be null" );
        }
        this.houseEquipments = houseEquipments;
    }

    public List<HouseEquipment> getHouseEquipments() throws NullLinkException {
        if (this.houseEquipments == null){
            throw new NullLinkException();
        }
        return houseEquipments;
    }

    public void setHouseEquipments(List<HouseEquipment> houseEquipments) throws NullLinkException {
        new CheckParametrOfHouseEquipment ().IsNull ( houseEquipments );
        this.houseEquipments = houseEquipments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComercialBuilding)) return false;
        ComercialBuilding comercialBuilding = (ComercialBuilding) o;
        return houseEquipments.equals ( comercialBuilding.houseEquipments );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( houseEquipments );
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder ( "amount equinments = " + houseEquipments.size () + '\n' );

        for (HouseEquipment he : houseEquipments) {
            builder.append ( he.toString () + '\n' );
        }

        return builder.toString ();
    }
}
