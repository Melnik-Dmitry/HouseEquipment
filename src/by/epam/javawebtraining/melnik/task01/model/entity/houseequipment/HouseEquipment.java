package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.PowerConsumptionEquipmentException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.TotalEnergyEquipmentExeption;
import by.epam.javawebtraining.melnik.task01.view.ConsolePrint;

import java.util.Objects;

public class HouseEquipment implements Cloneable {

    public final static double MAX_TOTAL_POWER = 2500;
    public final static double MIN_TOTAL_POWER = 500;
    public final static double CONSUMPTION_RATIO = 0.7;

    private double totalPower;
    private double powerConsumption;
    private HouseEquipmentType type;
    private boolean isTurningOn;

    public HouseEquipment() {
    }

    public HouseEquipment(double totalPower, double powerConsumption, HouseEquipmentType type) {

        if (totalPower <= MIN_TOTAL_POWER || totalPower > MAX_TOTAL_POWER) {
            new ConsolePrint().print("Invalid parameter in constructor. Parameters were set by default");
            return;
        } else if (powerConsumption <= MIN_TOTAL_POWER * CONSUMPTION_RATIO || powerConsumption > totalPower * CONSUMPTION_RATIO) {
            new ConsolePrint().print("Invalid parameter in constructor. Parameters were set by default");
            return;
        }
//        else if (totalPower <= powerConsumption) {
//            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameters were set by default" );
//            return;
//        }
        this.totalPower = totalPower;
        this.powerConsumption = powerConsumption;
        this.type = type;
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

    public HouseEquipmentType getType() {
        return type;
    }

    public void setTotalPower(double totalPower) throws TotalEnergyEquipmentExeption {
        if (totalPower <= MIN_TOTAL_POWER || totalPower > MAX_TOTAL_POWER) {
            throw new TotalEnergyEquipmentExeption();
        }
        this.totalPower = totalPower;
    }

    public void setPowerConsumption(double powerConsumption) throws PowerConsumptionEquipmentException {
        if (powerConsumption <= MIN_TOTAL_POWER * CONSUMPTION_RATIO
                || powerConsumption > totalPower * CONSUMPTION_RATIO) {
            throw new PowerConsumptionEquipmentException();
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
