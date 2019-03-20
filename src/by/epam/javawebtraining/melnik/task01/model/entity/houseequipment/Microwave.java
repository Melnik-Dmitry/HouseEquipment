package by.epam.javawebtraining.melnik.task01.model.entity.houseequipment;

import by.epam.javawebtraining.melnik.task01.localisation.HouseEquipmentConstant;
import by.epam.javawebtraining.melnik.task01.model.exception.logicexeption.InnerVolumeMicrowaveException;

import java.util.Objects;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class Microwave extends HouseEquipment {

	 public static final int SMALL_VOLUME = 17;
	 public static final int BIG_VOLUME = 20;

	 private int innerVolume;

	 public Microwave() {
		  super.setType ( HouseEquipmentType.MICROWAWE );
	 }

	 public Microwave(double generalPower, double powerConsumption, int innerVolume) {
		  super ( generalPower, powerConsumption, HouseEquipmentType.MICROWAWE );
		  if (innerVolume != SMALL_VOLUME && innerVolume != BIG_VOLUME) {
				appLogger.info ( "Invalid constructor parameters. Default values" );
				return;
		  }
		  this.innerVolume = innerVolume;
	 }

	 public Microwave(Microwave original) {
		  super ( original );
		  this.innerVolume = original.innerVolume;
	 }

	 public int getInnerVolume() {
		  return innerVolume;
	 }

	 public void setInnerVolume(int innerVolume) throws InnerVolumeMicrowaveException {
		  if (innerVolume != SMALL_VOLUME && innerVolume != BIG_VOLUME) {
				appLogger.warn ( "Invalid method parameters." );
				throw new InnerVolumeMicrowaveException ();
		  }
		  this.innerVolume = innerVolume;
	 }

	 @Override
	 public boolean equals(Object o) {
		  if (this == o) {
				return true;
		  }
		  if (!(o instanceof Microwave)) {
				return false;
		  }
		  if (!super.equals ( o )) {
				return false;
		  }
		  Microwave microwave = (Microwave) o;
		  return innerVolume == microwave.innerVolume;
	 }

	 @Override
	 public int hashCode() {
		  return Objects.hash ( super.hashCode (), innerVolume );
	 }

	 @Override
	 public String toString() {
		  return HouseEquipmentConstant.MICROWAVE_NAME + "{"
					 + HouseEquipmentConstant.MICROWAVE_INNER_VOLUME + " = " + innerVolume
					 + ", " + super.toString () + "}";
	 }
}
