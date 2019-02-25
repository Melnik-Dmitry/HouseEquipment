package by.epam.javawebtraining.melnik.task01.controller;

import by.epam.javawebtraining.melnik.task01.comparator.EquipmentComparator;
import by.epam.javawebtraining.melnik.task01.model.entity.houseequipment.HouseEquipment;
import by.epam.javawebtraining.melnik.task01.model.entity.storage.Building;
import by.epam.javawebtraining.melnik.task01.model.exception.EmptyListException;
import by.epam.javawebtraining.melnik.task01.model.exception.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.NullLinkException;
import by.epam.javawebtraining.melnik.task01.model.logic.FlatOwner;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.SearchParameter;
import by.epam.javawebtraining.melnik.task01.model.logic.parametersearch.searchparameterpower.SearchParameterTotalEnergy;
import by.epam.javawebtraining.melnik.task01.model.logic.powercontrol.PowerFlatEquipmentControl;
import by.epam.javawebtraining.melnik.task01.model.logic.sorting.SortHouseEquipment;
import by.epam.javawebtraining.melnik.task01.util.EquipmentCreatorOnWarehouse;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.FlatOwnerCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.PrintCreator;
import by.epam.javawebtraining.melnik.task01.util.createobject.WarehouseCreator;
import by.epam.javawebtraining.melnik.task01.view.Print;

public class appController {
    public static void main(String[] args) {
        run ();
    }


    public static void run() {

        Building warehouse = WarehouseCreator.createWarehouse ();
        Building flat = FlatCreator.createFlatWithParameters ( 10 );

        try {
            FlatOwner flatOwner = FlatOwnerCreator.createFlatOwnerWithParameters ( "Melnik", flat );
            EquipmentCreatorOnWarehouse.addEquipmentOnWarehose ( warehouse, 6 );

            flatOwner.addAllHouseEquipmentInFlat
                    ( flatOwner.buyHouseEquipmentFromWarehouse ( 3, warehouse ) );
        } catch (InvalidParameterException e) {
            e.printStackTrace ();
        } catch (NullLinkException e) {
            e.printStackTrace ();
        }

        Print printer = PrintCreator.createPrint ();
        printer.print ( warehouse.toString () );
        printer.print ( flat.toString () );

        SearchParameter searchParameterTotalEnergy = new SearchParameterTotalEnergy ();
        try {
            HouseEquipment maxOnWaterhouse = ((SearchParameterTotalEnergy) searchParameterTotalEnergy)
                    .takeEquipmentWithMaxPower ( warehouse );
            printer.print ( maxOnWaterhouse.toString () );

            HouseEquipment maxInFlat = ((SearchParameterTotalEnergy) searchParameterTotalEnergy).
                    takeEquipmentWithMaxPower ( flat );
            printer.print ( maxInFlat.toString () );

            HouseEquipment minOnWaterhouse = ((SearchParameterTotalEnergy) searchParameterTotalEnergy)
                    .takeEquipmentWithMinPower ( warehouse );
            printer.print ( minOnWaterhouse.toString () );

            HouseEquipment minInFlat = ((SearchParameterTotalEnergy) searchParameterTotalEnergy)
                    .takeEquipmentWithMinPower ( flat );
            printer.print ( minInFlat.toString () );

        } catch (NullLinkException e) {
            e.printStackTrace ();
        } catch (EmptyListException e) {
            e.printStackTrace ();
        }

        new SortHouseEquipment ().sortSomething ( warehouse, new EquipmentComparator () );
        printer.print ( warehouse.toString () );
        new SortHouseEquipment ().sortSomething ( flat, new EquipmentComparator () );
        printer.print ( flat.toString () );

        try {
            printer.print ( String.valueOf ( new PowerFlatEquipmentControl ().deemTotalPower ( warehouse ) ) );
            printer.print ( String.valueOf ( new PowerFlatEquipmentControl ().deemPowerConsumption ( warehouse ) ) );
        } catch (NullLinkException e) {
            e.printStackTrace ();
        } catch (EmptyListException e) {
            e.printStackTrace ();
        }

        for (int i = 0; i < warehouse.getHouseEquipments ().size (); i++) {
            warehouse.getHouseEquipments ().get ( i ).turnOn ();
        }

        try {
            printer.print ( String.valueOf ( new PowerFlatEquipmentControl ().deemPowerConsumption ( warehouse ) ) );
        } catch (NullLinkException e) {
            e.printStackTrace ();
        } catch (EmptyListException e) {
            e.printStackTrace ();
        }
    }
}
