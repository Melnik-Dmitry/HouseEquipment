package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

public class HouseEquipment {

    public final static double MAX_TOTAL_POWER = 2500;
    public final static double MAX_POWER_CONSUMPTION = MAX_TOTAL_POWER * 0.7;

    private double totalPower;
    private double powerConsumption;
    private boolean isTurningOn;

    public HouseEquipment() {
    }

    public HouseEquipment(double totalPower, double powerConsumption) {

        if (totalPower <= 0 || totalPower > MAX_TOTAL_POWER) {
            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameters were set by default" );
            return;
        } else if (powerConsumption <= 0 || powerConsumption > MAX_POWER_CONSUMPTION) {
            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameters were set by default" );
            return;
        } else if (totalPower <= powerConsumption) {
            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameters were set by default" );
            return;
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

    public void setTotalPower(double totalPower) throws InvalidParameterException {
        if (totalPower <= 0 || totalPower > MAX_TOTAL_POWER) {
            throw new InvalidParameterException ();
        }
        this.totalPower = totalPower;
    }

    public void setPowerConsumption(double powerConsumption) throws InvalidParameterException {
        if (powerConsumption <= 0 || powerConsumption > MAX_POWER_CONSUMPTION) {
            throw new InvalidParameterException ();
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
        return Double.compare ( that.totalPower, totalPower ) == 0 &&
                Double.compare ( that.powerConsumption, powerConsumption ) == 0 &&
                isTurningOn == that.isTurningOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( totalPower, powerConsumption, isTurningOn );
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
