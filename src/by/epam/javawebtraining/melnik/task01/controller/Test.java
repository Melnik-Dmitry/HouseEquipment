package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipmentType;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.ComercialBuilding;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.util.createhouseequipment.CreatorHouseEquipment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        HouseEquipment microwave = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MICROWAWE );
        HouseEquipment multicooker = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.MULTICOOKER );
        HouseEquipment toast = CreatorHouseEquipment.createHouseEquipment ( HouseEquipmentType.TOAST );

        List<HouseEquipment> firstListEquipments = new ArrayList<> ();
        firstListEquipments.add ( microwave );
        firstListEquipments.add ( multicooker );
        firstListEquipments.add ( toast );



        List<HouseEquipment> secondListEquipments = (List<HouseEquipment>)
                ((ArrayList<HouseEquipment>) firstListEquipments).clone ();
//
//        List<HouseEquipment> secondListEquipments = new ArrayList<> ();
//        secondListEquipments.add ( null );
//        secondListEquipments.add ( null );
//        secondListEquipments.add ( null );
//
//
//
//
//
//        Collections.copy( secondListEquipments, firstListEquipments);
//        try {
//            secondListEquipments.get ( 0 ).setTotalPower ( 100 );
//        } catch (InvalidParameterException e) {
//            e.printStackTrace ();
//        }


        System.out.println ();

        ComercialBuilding building = new ComercialBuilding ( null );

    }
}
