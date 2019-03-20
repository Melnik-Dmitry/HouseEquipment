package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.localisation.HouseEquipmentConstant;

import java.util.Objects;

public class Toast extends HouseEquipment {

	 private boolean isHasToastCooler;

	 public Toast() {
		  super.setType ( HouseEquipmentType.TOAST );
	 }

	 public Toast(double generalPower, double powerConsumption, boolean isHasToastCooler) {
		  super ( generalPower, powerConsumption, HouseEquipmentType.TOAST );
		  this.isHasToastCooler = isHasToastCooler;
	 }

	 public Toast(Toast original) {
		  super ( original );
		  this.isHasToastCooler = original.isHasToastCooler;
	 }

	 public boolean isHasToastCooler() {
		  return isHasToastCooler;
	 }

	 public void setHasToastCooler(boolean hasToastCooler) {
		  isHasToastCooler = hasToastCooler;
	 }

	 @Override
	 public boolean equals(Object o) {
		  if (this == o) {
				return true;
		  }
		  if (!(o instanceof Toast)) {
				return false;
		  }
		  if (!super.equals ( o )) {
				return false;
		  }
		  Toast toast = (Toast) o;
		  return isHasToastCooler == toast.isHasToastCooler;
	 }

	 @Override
	 public int hashCode() {
		  return Objects.hash ( super.hashCode (), isHasToastCooler );
	 }

	 @Override
	 public String toString() {
		  return HouseEquipmentConstant.TOAST_NAME + "{" +
					 HouseEquipmentConstant.TOAST_COOLER + " = " + isHasToastCooler +
					 ", " + super.toString () + "} ";
	 }
}
