package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.PowerConsumptionEquipmentException;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.TotalEnergyEquipmentException;

import java.util.Objects;

public class HouseEquipment implements Cloneable {

	 public final static double MAX_TOTAL_POWER = 2500;
	 public final static double MIN_TOTAL_POWER = 500;
	 public final static double MAX_CONSUMPTION_RATIO = 0.7;
	 public final static double MiX_CONSUMPTION_RATIO = 0.55;

	 private double totalPower;
	 private double powerConsumption;
	 private HouseEquipmentType type;
	 private boolean isTurningOn;

	 public HouseEquipment() {
	 }
	 //            new ConsolePrint ().print ( "Invalid parameter in constructor. Parameter totalPower was set by default" );
	 public HouseEquipment(double totalPower, double powerConsumption, HouseEquipmentType type) {

		  if ((totalPower <= MIN_TOTAL_POWER || totalPower > MAX_TOTAL_POWER)
					 || (powerConsumption < totalPower * MiX_CONSUMPTION_RATIO
					 || powerConsumption > totalPower * MAX_CONSUMPTION_RATIO)) {

				return;
		  }

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

	 public void setTotalPower(double totalPower) throws TotalEnergyEquipmentException {
		  if (totalPower <= MIN_TOTAL_POWER || totalPower > MAX_TOTAL_POWER) {
				throw new TotalEnergyEquipmentException ();
		  }
		  this.totalPower = totalPower;
	 }

	 public void setPowerConsumption(double powerConsumption) throws PowerConsumptionEquipmentException {
		  if (powerConsumption < totalPower * MiX_CONSUMPTION_RATIO
					 || powerConsumption > totalPower * MAX_CONSUMPTION_RATIO) {
				throw new PowerConsumptionEquipmentException ();
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
