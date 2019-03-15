package by.epam.javawebtraining.melnik.task01.model.entity.storage;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.*;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.validation.CheckBuildingParameters;

import java.util.Arrays;

public class ShopSection {
	 public static final int DEFAULT_CAPACITY = 0;

	 private HouseEquipment[] equipmentsInSection;

	 public ShopSection() {
		  equipmentsInSection = new HouseEquipment[DEFAULT_CAPACITY];
	 }

	 public ShopSection(HouseEquipment[] equipmentsInSection) {

		  if (equipmentsInSection == null) {
				this.equipmentsInSection = new HouseEquipment[DEFAULT_CAPACITY];
				return;
		  }
		  this.equipmentsInSection = equipmentsInSection;
	 }

	 public ShopSection (ShopSection original){

		  HouseEquipment[] equipm = new HouseEquipment[original.equipmentsInSection.length];
		  for (int i = 0; i < equipm.length; i++) {

				if (original.equipmentsInSection[i] == null) {
					 continue;
				}

				if (original.equipmentsInSection[i].getType ().equals ( HouseEquipmentType.MICROWAWE )) {
					 equipm[i] = new Microwave ( (Microwave) original.equipmentsInSection[i] );

				} else if (original.equipmentsInSection[i].getType ().equals ( HouseEquipmentType.MULTICOOKER )) {
					 equipm[i] = new Multicooker ( (Multicooker) original.equipmentsInSection[i] );

				} else {
					 equipm[i] = new Toast ( (Toast) original.equipmentsInSection[i] );
				}
		  }

		  this.equipmentsInSection = equipm;

	 }

	 public HouseEquipment[] getEquipmentsInSection() {
		  return equipmentsInSection;
	 }

	 public void setEquipmentsInSection(HouseEquipment[] equipmentsInSection) throws InvalidParameterException {

		  new CheckBuildingParameters ().IsNull ( equipmentsInSection );
		  this.equipmentsInSection = equipmentsInSection;
	 }

	 @Override
	 public boolean equals(Object o) {
		  if (this == o) return true;
		  if (!(o instanceof ShopSection)) return false;
		  ShopSection section = (ShopSection) o;
		  return Arrays.equals ( equipmentsInSection, section.equipmentsInSection );
	 }

	 @Override
	 public int hashCode() {
		  return Arrays.hashCode ( equipmentsInSection );
	 }
}
