package by.epam.javawebtraining.melnik.task01.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApplicationController {

    public static final Logger appLogger = LogManager.getLogger(ApplicationController.class.getName());

    public static void main(String[] args) {
        appLogger.info("Start application");

        ControllerSearchPower.runSearchPower();
        AddEquipmentController.runAddElementsInShop();
        ControllerPowerControl.runPowerBuildingEquipmentControl();
        ControllerSort.runSortHouseEquipment();


        appLogger.info("Finish application.");
    }
}

