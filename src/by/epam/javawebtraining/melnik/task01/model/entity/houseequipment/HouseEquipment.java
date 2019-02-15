package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.ConstructorInvalidParametrException;

import java.util.Objects;

public class HouseEquipment {

    private double totalPower;
    private double powerConsumption;
    private boolean isTurningOn;

    public HouseEquipment() {
    }

    public HouseEquipment(double totalPower, double powerConsumption) {
        if ((totalPower <= 0 || totalPower > 2500) & (powerConsumption <= 0 || powerConsumption > 1800)) {
            try {
                throw new ConstructorInvalidParametrException();
            } catch (ConstructorInvalidParametrException e) {
                e.printStackTrace();
            }
        }

        this.totalPower = totalPower;
        this.powerConsumption = powerConsumption;
        this.isTurningOn = false;
    }

    public double getTotalPower() {
        return totalPower;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public boolean getIsTurningOn() {
        return isTurningOn;
    }

    public void setTotalPower(double totalPower) {
        if (totalPower <= 0 || totalPower > 2500) {
            System.out.println("Invalid data, default parameter");
            return;
        }
        this.totalPower = totalPower;
    }

    public void setPowerConsumption(double powerConsumption) {
        if (powerConsumption <= 0 || powerConsumption > 1800) {
            System.out.println("Invalid data, default parameter");
            return;
        }
        this.powerConsumption = powerConsumption;
    }

    public void setIsTurningOn(boolean isTurningOn) {
        this.isTurningOn = isTurningOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HouseEquipment)) return false;
        HouseEquipment that = (HouseEquipment) o;
        return Double.compare(that.totalPower, totalPower) == 0 &&
                Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                isTurningOn == that.isTurningOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPower, powerConsumption, isTurningOn);
    }

    public void turnOn() {
        isTurningOn = true;
    }

    public void turnOff() {
        isTurningOn = false;
    }

    @Override
    public String toString() {
        return "totalPower = " + totalPower +
                ", powerConsumption = " + powerConsumption +
                ", isTurningOn = " + isTurningOn;
    }
}
