package by.epam.javawebtraining.melnik.task01.localisation;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.*;

import java.util.Locale;
import java.util.ResourceBundle;

public class HouseEquipmentConstant {

	 private static ResourceBundle bundle;
	 private static Locale locale;

	 static {
		  changeLocal ( Locale.getDefault () );
	 }

	 public static String TOTAL_POWER;
	 public static String POWER_CONSUMPTION;
	 public static String IS_TURNING_ON;
	 public static String MICROWAVE_NAME;
	 public static String MICROWAVE_INNER_VOLUME;
	 public static String MULTICOOKER_NAME;
	 public static String MULTICOOKER_PROGRAME;
	 public static String TOAST_NAME;
	 public static String TOAST_COOLER;

	 public static void changeLocal(Locale locale) {
		  bundle = ResourceBundle.getBundle (
					 "HouseEquipLocal",
					 locale ); //имя файла

		  TOTAL_POWER = bundle.getString ( "totalPower" );
		  POWER_CONSUMPTION = bundle.getString ( "powerConsumption" );
		  IS_TURNING_ON = bundle.getString ( "isTurningOn" );
		  MICROWAVE_NAME = bundle.getString ( "Microwave" );
		  MICROWAVE_INNER_VOLUME = bundle.getString ( "innerVolume" );
		  MULTICOOKER_NAME = bundle.getString ( "Multicooker" );
		  MULTICOOKER_PROGRAME = bundle.getString ( "amountOfProgram" );
		  TOAST_NAME = bundle.getString ( "Toast" );
		  TOAST_COOLER = bundle.getString ( "isHasToastCooler" );
	 }

	 public static void main(String[] args) {
		  HouseEquipment eeq = new HouseEquipment ( 1000, 700, HouseEquipmentType.TOAST );
		  HouseEquipment micro = new Microwave ( 1000, 700, 20 );
		  HouseEquipment multi = new Multicooker ( 1000, 700, 20 );
		  HouseEquipment toast = new Toast ( 1100,770, false );
		  System.out.println ( eeq );
		  System.out.println ( micro );
		  System.out.println ( multi );
		  System.out.println (toast);
//		  changeLocal ( new Locale ( "ru", "Ru" ) );
//		  eeq = new HouseEquipment ( 1000, 700, HouseEquipmentType.TOAST );
	 }
}
