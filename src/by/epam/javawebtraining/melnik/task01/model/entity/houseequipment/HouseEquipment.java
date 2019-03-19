package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.controller.ApplicationController;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.PowerConsumptionEquipmentException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.TotalEnergyEquipmentException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.Objects;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class HouseEquipment implements Cloneable, Serializable{

    public static final double MAX_TOTAL_POWER = 2500;
    public static final double MIN_TOTAL_POWER = 500;
    public static final double MAX_CONSUMPTION_RATIO = 0.7;
    public static final double MiX_CONSUMPTION_RATIO = 0.55;

//    public static final Logger entityLogger = LogManager.getLogger(HouseEquipment.class.getName());

    private double totalPower;
    private double powerConsumption;
    private HouseEquipmentType type;
    private boolean isTurningOn;

    public HouseEquipment() {
    }

    public HouseEquipment(double totalPower, double powerConsumption, HouseEquipmentType type) {

        if ((totalPower <= MIN_TOTAL_POWER || totalPower > MAX_TOTAL_POWER)
                || (powerConsumption < totalPower * MiX_CONSUMPTION_RATIO
                || powerConsumption > totalPower * MAX_CONSUMPTION_RATIO)) {
            appLogger.info("Invalid constructor parameters. Default values");
            return;
        }

        this.totalPower = totalPower;
        this.powerConsumption = powerConsumption;
        this.type = type;
        this.isTurningOn = false;
    }

    public HouseEquipment(HouseEquipment original) {
        this.totalPower = original.totalPower;
        this.powerConsumption = original.powerConsumption;
        this.type = original.type;
        this.isTurningOn = original.isTurningOn;
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

    void setType(HouseEquipmentType type) {
        this.type = type;
    }

    public void setTotalPower(double totalPower) throws TotalEnergyEquipmentException {
        if (totalPower <= MIN_TOTAL_POWER || totalPower > MAX_TOTAL_POWER) {
            appLogger.error("Invalid method parameters.");
            throw new TotalEnergyEquipmentException();
        }
        this.totalPower = totalPower;
    }

    public void setPowerConsumption(double powerConsumption) throws PowerConsumptionEquipmentException {
        if (powerConsumption < totalPower * MiX_CONSUMPTION_RATIO
                || powerConsumption > totalPower * MAX_CONSUMPTION_RATIO) {
            appLogger.error("Invalid method parameters.");
            throw new PowerConsumptionEquipmentException();
        }
        this.powerConsumption = powerConsumption;
    }

    public void setIsTurningOn(boolean isTurningOn) {
        this.isTurningOn = isTurningOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof HouseEquipment)) {return false;}
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
