package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import java.util.Objects;

public class Toast extends HouseEquipment {

    private boolean isHasToastCooler;

    public Toast() {
    }

    public Toast(double generalPower, double powerConsumption, boolean isHasToastCooler) {
        super ( generalPower, powerConsumption, HouseEquipmentType.TOAST );
        this.isHasToastCooler = isHasToastCooler;
    }

    public boolean isHasToastCooler() {
        return isHasToastCooler;
    }

    public void setHasToastCooler(boolean hasToastCooler) {
        isHasToastCooler = hasToastCooler;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toast)) return false;
        if (!super.equals ( o )) return false;
        Toast toast = (Toast) o;
        return isHasToastCooler == toast.isHasToastCooler;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( super.hashCode (), isHasToastCooler );
    }

    @Override
    public String toString() {
        return "Toast{" +
                "isHasToastCooler = " + isHasToastCooler +
                ", " + super.toString () + "} ";
    }
}
