package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.localisation.HouseEquipmentConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class ApplicationController {

    public static final Logger appLogger = LogManager.getLogger(ApplicationController.class.getName());

    public static void main(String[] args) {
        appLogger.info("Start application");

        HouseEquipmentConstant.changeLocal ( new Locale ( "ru", "RU" ) );

        ControllerSearchPower.runSearchPower();
        AddEquipmentController.runAddElementsInShop();
        ControllerPowerControl.runPowerBuildingEquipmentControl();
        ControllerSort.runSortHouseEquipment();
        CreateEntityFromFileController.runController ();
        SerializationController.runSerializationController ();

        appLogger.info("Finish application.");
    }
}

